public class DemonioSombras extends Demonio {

    public static int limite = 50;

    @Override
    public boolean condicionParticular(Almas alma) {

        return (alma.getValor() < limite);
    }

    @Override
    public void atormentarA(Almas alma) {
        super.atormentarA(alma);
        alma.mitadValor();
    }
}