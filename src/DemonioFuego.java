public class DemonioFuego extends Demonio {

    @Override
    public boolean condicionParticular(Almas alma) {

        return !(alma.isFriolenta());

    }
    @Override
    public void atormentarA(Almas alma) {
        super.atormentarA(alma);
        alma.setFriolenta(false);
    }
}