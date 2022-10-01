package pallas.example1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
public class Mufaj {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    public long id;
    public String nev;

    @ManyToOne()
    public Cikk cikk;
    private Mufaj(){}
}
