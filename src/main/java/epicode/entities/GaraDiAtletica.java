package epicode.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
@Entity
@Table(name = "gara_di_atletica")
public class GaraDiAtletica extends Event{
    List<Person>setAtleti;
    Person vincitore;

    public GaraDiAtletica(List<Person> setAtleti,Person vincitore) {
        this.setAtleti = setAtleti;
        this.vincitore=vincitore;
    }

    public List<Person> getSetAtleti() {
        return setAtleti;
    }

    public void setSetAtleti(List<Person> setAtleti) {
        this.setAtleti = setAtleti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }
}
