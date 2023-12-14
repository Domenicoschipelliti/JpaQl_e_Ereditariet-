package epicode.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
@Entity
@Table(name = "gara_di_atletica")
public class GaraDiAtletica extends Event{
    List<Person>setAtleti;
    Person vincitore;

    public GaraDiAtletica( Person vincitore) {
        this.vincitore=vincitore;
    }

    public GaraDiAtletica(){

    }

    public List<Person> getSetAtleti() {
        return setAtleti;
    }



    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "setAtleti=" + setAtleti +
                ", vincitore=" + vincitore +
                '}';
    }
}
