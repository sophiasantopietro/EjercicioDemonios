import java.util.ArrayList;
import java.util.List;

public class Lugar  {
    private String nombre;
    public List<Almas> lasAlmas = new ArrayList<Almas>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Almas> getLasAlmas() {
        return lasAlmas;
    }

    public void setLasAlmas(List<Almas> lasAlmas) {
        this.lasAlmas = lasAlmas;
    }


    public List<Almas> almasCazables(Demonio demonio) {
        List<Almas> cazables = new ArrayList<Almas>();
        for (Almas alma : this.getLasAlmas()) {
            if (demonio.puedeCazar(alma)) {
                cazables.add(alma);
            }
        }
        return cazables;
    }

    public void removerAlma(Almas alma){
        lasAlmas.remove(alma);
    }


    }




