package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class CleBloqueUtilisateur implements Serializable {


    @Column(name="adresse_email")
    private String adresseEmail;

    @Column(name = "adresse_email_1")
    private String adresseEmail_1;

    @Column(name = "id_motif")
    private int idMotif;


}
