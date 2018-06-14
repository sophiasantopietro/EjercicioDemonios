import java.util.ArrayList;
import java.util.List;

public class Diablo {

        public List<Demonio> demonios = new ArrayList<Demonio>();


        public void init(){
                Lugar lugar = new Lugar();
                Almas alma  = new Almas();
                List<Almas> almas = new ArrayList<>();
                almas.add(alma);
                lugar.setAlmas(almas);
                lugar.setNombre("Asgard");
        }
}
