import java.util.ArrayList;
import java.util.List;

public class Tormento extends Mision {

    public int nivelDeBondad;

    public List<Lugar> lugares = new ArrayList<Lugar>();


    public int getNivelDeBondad() {
        return nivelDeBondad;
    }

    public void setNivelDeBondad(int nivelDeBondad) {
        this.nivelDeBondad = nivelDeBondad;
    }
}
