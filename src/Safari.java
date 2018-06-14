public class Safari extends Mision implements Visitor {


    public int minimo;
    public String lugar;




    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    @Override
    public boolean visit(Demonio demonio) {
        return false;
    }
}
