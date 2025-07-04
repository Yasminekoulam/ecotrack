package EcoTrack.server.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String authority;

    /*@OneToMany(mappedBy = "role")
    private ArrayList<User> users = new ArrayList<>();*/

    /* pas necessaire de savoir la liste des users qui ont un role specifique,
     mais c'est necessaire de connaitre quel role est associe au user*/
}