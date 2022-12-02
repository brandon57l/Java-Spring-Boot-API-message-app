package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Groupe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGroupe;
    private String nomGroupe;
    private Date dateCreationGroupe;
    private Date dateFinGroupe;

    @ManyToMany(mappedBy = "groupesGestionnaire")
    private List<Utilisateur> gestionnaires = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "groupe_salon",
            joinColumns = @JoinColumn(name = "id_groupe"),
            inverseJoinColumns = @JoinColumn(name = "id_salon"))
    private List<Salon> salons = new ArrayList<>();

    @ManyToMany(mappedBy = "groupesUtilisateurs")
    private List<Utilisateur> utilisateurs = new ArrayList<>();
}
