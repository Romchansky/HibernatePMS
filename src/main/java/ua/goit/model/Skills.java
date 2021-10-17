package ua.goit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "skills")
public class Skills implements BaseEntity<Long> {

    private static final long serialVersionUID = -3919568724895895484L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "language")
    private String language;

    @Column(name = "level")
    private String level;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name = "developers_skills",
            joinColumns = {@JoinColumn(name = "id_skill")},
            inverseJoinColumns = {@JoinColumn(name = "id_developer")})
    private Set<Developer> developers;

}
