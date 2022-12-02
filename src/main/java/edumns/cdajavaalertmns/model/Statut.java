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
public class Statut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStatut;
    private String libelleStatut;


    @ManyToMany
    private Utilisateur utilisateur;

    @ManyToMany
    @JoinTable(
            name = "droit_statut",
            joinColumns = @JoinColumn(name = "id_statut"),
            inverseJoinColumns = @JoinColumn(name = "libelle_droit"))
    private List<Droit> droits = new ArrayList<>();


}
