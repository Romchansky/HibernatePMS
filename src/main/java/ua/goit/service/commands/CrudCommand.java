package ua.goit.service.commands;

import ua.goit.model.BaseEntity;
import ua.goit.repository.CrudRepository;
import ua.goit.repository.RepositoryFactory;
import ua.goit.view.View;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public abstract class CrudCommand<E extends BaseEntity<ID>, ID> implements Command {
    private final CrudRepository<E, ID> crudRepository;
    private final Class<E> modelClass;
    protected final View view;
    protected final Map<String, Command> commands;

    public CrudCommand(View view, Map<String, Command> commands, Class<E> modelClass) {
        this.view = view;
        this.modelClass = modelClass;
        this.crudRepository = RepositoryFactory.of(modelClass);
        this.commands = commands;
    }

    protected void findAll() {
        List<E> result = crudRepository.findAll();
        sendResult(!result.isEmpty(), result);
    }

    protected void findById() {
        Optional<E> result = crudRepository.findById(parseId("Введите ID"));
        sendResult(result.isPresent(), result);
    }

    protected void deleteById() {
        crudRepository.deleteById(parseId("Введите ID по которому хотите удалить"));
        view.write("Объект удален");
    }

    protected void save(E entity) {
        view.write("Вы сохранили - " + entity);
        crudRepository.save(entity);
    }

    private ID parseId(String message) {
        view.write(message);
        return (ID) Long.valueOf(view.read());
    }

    private void sendResult(Boolean isDone, Object... result) {
        if (isDone) view.write(result);
        else view.write("По вашему запросу ничего не найдено");
    }

    private void sendResult(Boolean isDone, List result) {
        sendResult(isDone, result.toArray());
    }
}
