package edumns.cdajavaalertmns.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Arborescence {

    @Id
    @GeneratedValue
    private int idArbo;
    private String libelleArbo;
    private boolean defaut;

    @ManyToOne
    @JsonIgnore
    private Arborescence parent;

    @OneToMany(mappedBy = "parent")
    private List<Arborescence> enfants;

    @ManyToMany
    @JoinTable(
            name = "stock_message",
            joinColumns = @JoinColumn(name = "id_arbo"),
            inverseJoinColumns = @JoinColumn(name = "id_message"))
    private List<Message> messages = new ArrayList<>();
}
