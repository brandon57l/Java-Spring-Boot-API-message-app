package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class CleReceptionMessage implements Serializable {


    @Column(name="adresse_email")
    private String adresseEmail;

    @Column(name = "id_message")
    private int idMessage;

}
