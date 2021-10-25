package ua.goit.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "projects")
@ToString(exclude = "projects")
@Entity
@Table(name = "customer")
public class Customer implements BaseEntity<Long>{

    private static final long serialVersionUID = -9040276526421301639L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "industry")
    private String industry;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "customers_projects",
            joinColumns = {@JoinColumn(name = "id_customer")},
            inverseJoinColumns = {@JoinColumn(name = "id_project")})
    private Set<Project> projects;

}
