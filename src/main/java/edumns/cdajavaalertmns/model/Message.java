package edumns.cdajavaalertmns.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.datetime.standard.DateTimeContext;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMessage;
    private String contenu;
    private Date dateCreationMessage;
    private Date heureEnvoiMessage;

    @ManyToOne
    private Salon salon;
    @OneToMany(mappedBy="message")
    private List<PieceJointe> pieceJointe = new ArrayList<>();
    @ManyToOne
    private Arborescence arborescence;

}

