public class Almas {
    public int bondad;
    public int valor;
    public boolean friolenta;
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isFriolenta() {
        return friolenta;
    }

    public void setFriolenta(boolean friolenta) {
        this.friolenta = friolenta;
    }

    public void atormentar(){

        this.bondad -= 5;

    }

    public void mitadValor(){

        this.setValor( this.getValor / 2);

    }
}


