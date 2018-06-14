import java.util.ArrayList;
import java.util.List;

public abstract class Demonio implements Visitable {

    public String tipo;
    public int nivelMaldad;
    public List<Almas> almasCazadas = new ArrayList<Almas>();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivelMaldad() {
        return nivelMaldad;
    }

    public void setNivelMaldad(int nivelMaldad) {
        this.nivelMaldad = nivelMaldad;
    }

    @Override
    public boolean acept(Visitor visitor) {
        return visitor.visit(this);
    }

    public boolean puedeCazar(Almas alma) {
        boolean condicion1 = nivelMaldad> alma.getBondad();
        boolean condicion2 = this.condicionParticular(alma);
        return condicion1 && condicion2;
    }

    protected abstract boolean condicionParticular(Almas alma);



    public void atormentarA(Almas alma){
        alma.atormentar();
    }
    public void almasPuedeCazar(){


    }

}
