package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Reglage {

    @Id
    private String nomParametrage;
    private int valeur;
    private boolean modifiable;

    @ManyToMany
    Utilisateur utilisateur;

}
