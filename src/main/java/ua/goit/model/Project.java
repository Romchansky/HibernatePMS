package ua.goit.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"developers", "customers", "companies"})
@ToString(exclude = {"developers", "customers", "companies"})
@Entity
@Table(name = "project")
public class Project implements BaseEntity<Long> {

    private static final long serialVersionUID = -2093236360575548095L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "field")
    private String field;

    @Column(name = "cost")
    private Long cost;

    @Column(name = "create_date")
    private String createData;

    @ManyToMany(mappedBy = "projects")
    private Set<Company> companies;

    @ManyToMany(mappedBy = "projects")
    private Set<Customer> customers;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "developers_projects", joinColumns = {@JoinColumn(name = "id_project")},
            inverseJoinColumns = {@JoinColumn(name = "id_developer")})
    private Set<Developer> developers;

}