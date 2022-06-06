
package kincskereso.teszt;

import kincskereso.modell.Kincseslada;
import kincskereso.modell.Kincs;

public class Tesztelés {

    private Kincs kincs;
    private Kincseslada kincseslada;
    private boolean van;

    public Tesztelés() {

        System.out.println("------ TESZTESETEK ------");

        tesztKincsArany();
        tesztKincsEzust();
        tesztKincsBronz();
    }

    public static void main(String[] args) {

        new Tesztelés();
    }

    private void tesztKincsArany() {
        kincs.vanK(0);
        System.out.println("Arany teszt:");

    }

    public void tesztKincsEzust() {
        kincs.vanK(1);
        System.out.println("Ha az ezüst kerül kiválasztásra..");

    }

    ;
        
        
        public void tesztKincsBronz() {
        kincs.vanK(2);
        System.out.println("Ha az bronz kerül kiválasztásra..");
    }

}
