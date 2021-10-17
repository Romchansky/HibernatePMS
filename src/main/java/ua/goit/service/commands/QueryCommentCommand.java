package ua.goit.service.commands;

import ua.goit.model.Company;
import ua.goit.model.Customer;
import ua.goit.model.Developer;
import ua.goit.model.Project;
import ua.goit.repository.CrudRepository;
import ua.goit.repository.RepositoryFactory;


public class QueryCommentCommand {

    public static void main(String[] args) {

//        //Company
//        CrudRepository<Company, Long> companyRepository = RepositoryFactory.of(Company.class);
//        Company company = Company.builder()
//                .name("Epam")
//                .city("Kiev")
//                .build();
//        companyRepository.save(company);
//        companyRepository.close();
//
//
//        //Developer
//        CrudRepository<Developer, Long> developersRepository = RepositoryFactory.of(Developer.class);
//        Developer developer = Developer.builder()
//                .name("Tom")
//                .gender("male")
//                .age(25)
//                .salary(1000L)
//                .build();
//        developersRepository.save(developer);
//        developersRepository.close();
//
//
//        //Project
//        CrudRepository<Project, Long> projectRepository = RepositoryFactory.of(Project.class);
//        Project project = Project.builder()
//                .name("Red Dead Redemption")
//                .field("Gaming")
//                .cost(540000000L)
//                .createData("2018-10-26")
//                .build();
//        projectRepository.save(project);
//        projectRepository.close();
//
//
//        //Customer
//        CrudRepository<Customer, Long> customerRepository = RepositoryFactory.of(Customer.class);
//        Customer customer = Customer.builder()
//                .name("Rockstar Games")
//                .city("New York")
//                .industry("Video Games")
//                .build();
//        customerRepository.save(customer);
//        customerRepository.close();

    }

}
