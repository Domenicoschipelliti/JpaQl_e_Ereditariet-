package epicode.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "partita_di_calcio")
public class PartitaDiCalcio extends Event{

    String squadraDiCasa;
    String squadraOspite;
    String squadraVincente;

    int numeoroGolSquadraDiCasa;
    int numeroGolSquadraOspite;

    public PartitaDiCalcio(String squadraDiCasa,String squadraOspite,int numeoroGolSquadraDiCasa,int numeroGolSquadraOspite,String squadraVincente) {
        this.numeoroGolSquadraDiCasa = numeoroGolSquadraDiCasa;
        this.numeroGolSquadraOspite=numeroGolSquadraOspite;
        this.squadraOspite=squadraOspite;
        this.squadraDiCasa=squadraDiCasa;
        this.squadraVincente=squadraVincente;
    }

    public PartitaDiCalcio(){

    }

    public int getNumeoroGolSquadraDiCasa() {
        return numeoroGolSquadraDiCasa;
    }

    public void setNumeoroGolSquadraDiCasa(int numeoroGolSquadraDiCasa) {
        this.numeoroGolSquadraDiCasa = numeoroGolSquadraDiCasa;
    }

    public int getNumeroGolSquadraOspite() {
        return numeroGolSquadraOspite;
    }

    public void setNumeroGolSquadraOspite(int numeroGolSquadraOspite) {
        this.numeroGolSquadraOspite = numeroGolSquadraOspite;
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", numeoroGolSquadraDiCasa=" + numeoroGolSquadraDiCasa +
                ", numeroGolSquadraOspite=" + numeroGolSquadraOspite +
                '}';
    }
}
