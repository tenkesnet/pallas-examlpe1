package pallas.example1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Szerzo {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    public long id;
    public String nev;
    public int eletkor;
    public String cim;

    @OneToMany(mappedBy = "szerzo")
    public List<Cikk> cikkek;

    private Szerzo(){}
}
