package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@IdClass(CleBloqueUtilisateur.class)
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Motif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMotif;
    private String libelleMotif;

}
