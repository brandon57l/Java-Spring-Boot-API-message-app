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
public class Utilisateur {

    @Id
    private String adresseEmail;
    private String nom;
    private String prenom;
    private char sexe;
    private Date dateDeNaissance;
    private String adressePostale;
    private int numTelephone;
    private String statutUtilisateur;
    private Date dateCreationUtilisateur;
    private String motDePasse;

    @ManyToMany
    private List<Groupe> groupesUtilisateurs = new ArrayList<>();

    @OneToMany(mappedBy = "utilisateur")
    private List<Salon> salonsCree = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "reglage_utilisateur",
            joinColumns = @JoinColumn(name = "adresse_email"),
            inverseJoinColumns = @JoinColumn(name = "nom_parametrage"))
    private List<Reglage> reglages = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "statut_utilisateur",
            joinColumns = @JoinColumn(name = "adresse_email"),
            inverseJoinColumns = @JoinColumn(name = "id_statut"))
    private List<Statut> statuts = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "gere_groupe",
            joinColumns = @JoinColumn(name = "adresse_email"),
            inverseJoinColumns = @JoinColumn(name = "id_groupe"))
    private List<Groupe> groupesGestionnaire = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "groupe_utilisateur",
            joinColumns = @JoinColumn(name = "adresse_email"),
            inverseJoinColumns = @JoinColumn(name = "id_groupe"))
    private List<Groupe> groupesUtilisateur = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "inscription_salon",
            joinColumns = @JoinColumn(name = "adresse_email"),
            inverseJoinColumns = @JoinColumn(name = "id_salon"))
    private List<Salon> salons = new ArrayList<>();

}
