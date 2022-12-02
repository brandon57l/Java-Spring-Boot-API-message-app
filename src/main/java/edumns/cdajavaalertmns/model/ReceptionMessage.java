package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@IdClass(CleReceptionMessage.class)
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class ReceptionMessage {

    @Id
    private String adresseEmail;

    @Id
    private int idMessage;

    @ManyToOne
    @MapsId("adresse_email")
    @JoinColumn(name = "adresse_email")
    private Utilisateur utilisateur;

    @ManyToOne
    @MapsId("id_message")
    @JoinColumn(name = "id_message")
    private Message message;

    private Date dateLecture;

    private boolean lu;

}
