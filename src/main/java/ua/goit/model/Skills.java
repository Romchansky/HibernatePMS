package ua.goit.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"developers","companies"})
@ToString(exclude = {"developers","companies"})
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

    @ManyToMany(mappedBy = "skills")
    private Set<Developer> developers;

    @ManyToMany(mappedBy = "skills")
    private Set<Developer> companies;

}
