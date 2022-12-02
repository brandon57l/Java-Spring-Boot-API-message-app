package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Droit {

    @Id
    private String libelleDroit;

    @ManyToMany
    private Statut statut;

}
