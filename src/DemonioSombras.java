public class DemonioSombras extends Demonio {

    @Override
    public boolean condicionParticular(Almas alma) {
        int limite = 50;
        return (alma.getValor() < limite);
    }

    @Override
    public void atormentarA(Almas alma) {
        super.atormentarA(alma);
        alma.mitadValor() ;
    }
}