package pallas.example1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Cikk {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    public long id;
    public String cim;
    public String szoveg;
    public Date keszitve;

    @ManyToOne
    public Szerzo szerzo;

    @OneToMany(mappedBy = "cikk")
    public List<Mufaj> mufaj;

    private Cikk(){}
}
