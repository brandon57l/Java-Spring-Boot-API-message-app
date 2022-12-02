package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalon;
    private String nomSalon;
    private String typeSalon;

    @ManyToMany
    private Groupe groupe;
    @OneToMany(mappedBy="salon")
    private Message message;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToMany
    private List<Utilisateur> utilisateurInscrit = new ArrayList<>();

}
