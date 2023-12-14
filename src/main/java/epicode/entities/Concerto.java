package epicode.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "concerto")
public class Concerto extends Event{
  @Enumerated(EnumType.STRING)
  Genere genere;
  @Enumerated(EnumType.STRING)
  InStreaming inStreaming;

  public Concerto(Genere genere,InStreaming inStreaming) {
    this.genere = genere;
    this.inStreaming=inStreaming;
  }

  public Concerto(){

  }

  public Genere getGenere() {
    return genere;
  }

  public void setGenere(Genere genere) {
    this.genere = genere;
  }

  public InStreaming getInStreaming() {
    return inStreaming;
  }

  public void setInStreaming(InStreaming inStreaming) {
    this.inStreaming = inStreaming;
  }

  @Override
  public String toString() {
    return "Concerto{" +
            "genere=" + genere +
            ", inStreaming=" + inStreaming +
            '}';
  }
}
