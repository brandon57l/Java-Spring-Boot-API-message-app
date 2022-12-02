package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@IdClass(CleBloqueUtilisateur.class)
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BloqueUtilisateur {

    @Id
    private String adresseEmail;

    @Id
    private String adresseEmail_1;

    @Id
    private int idMotif;

    @ManyToOne
    @MapsId("adresse_email")
    @JoinColumn(name = "adresse_email")
    private Utilisateur utilisateur;

    @ManyToOne
    @MapsId("adresse_email_1")
    @JoinColumn(name = "adresse_email_1")
    private Utilisateur utilisateurBloque;

    @ManyToOne
    @MapsId("id_motif")
    @JoinColumn(name = "id_motif")
    private List<Motif> motifs = new ArrayList<>();
    // private Modif motif;



}
