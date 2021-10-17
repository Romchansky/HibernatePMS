package ua.goit.repository;

import org.hibernate.Session;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import ua.goit.model.BaseEntity;
import ua.goit.utils.HibernateSessionFactory;

import java.io.Closeable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

class CrudRepositoryHibernateImpl<E extends BaseEntity<ID>, ID> implements Closeable, CrudRepository<E, ID> {

    private final Class<E> modelClass;

    public CrudRepositoryHibernateImpl(Class<E> modelClass) {
        this.modelClass = modelClass;
    }

    @Override
    public List<E> saveAll(Iterable<E> itrb) {
        return StreamSupport.stream(itrb.spliterator(), false)
                .map(entity -> save(entity))
                .collect(Collectors.toList());
    }

    @Override
    public E save(E e) {
        Session session = createSession();
        ID id = (ID) session.save(e);
        Optional<E> result = getById(id, session);
        closeSession(session);
        return result.get();
    }

    @Override
    public void deleteById(ID id) {
        Session session = createSession();
        getById(id, session).ifPresent(session::remove);
        closeSession(session);

    }

    @Override
    public Optional<E> findById(ID id) {
        Session session = createSession();
        Optional<E> result = getById(id, session);
        closeSession(session);
        return result;
    }

    @Override
    public List<E> findAll() {
        Session session = createSession();
        JpaCriteriaQuery<E> query = session.getCriteriaBuilder().createQuery(modelClass);
        List<E> result = session.createQuery(query.select(query.from(modelClass))).getResultList();
        closeSession(session);
        return result;
    }

    @Override
    public void close() {
        HibernateSessionFactory.close();
    }

    private Session createSession() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        return session;
    }

    private void closeSession(Session session) {
        session.getTransaction().commit();
        session.close();
    }

    public Optional<E> getById(ID id, Session session) {
        return Optional.ofNullable(session.get(modelClass, id));
    }

}
