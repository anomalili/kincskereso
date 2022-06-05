/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kincskereso.teszt;

import kincskereso.modell.Kincseslada;
import kincskereso.modell.Kincs;

public class Tesztelés {

    private Kincs kincs;
    private Kincseslada kincseslada;

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
        System.out.println("Ha az arany kerül kiválasztásra..");
        
       
    }

    public void tesztKincsEzust() {
        System.out.println("Ha az ezüst kerül kiválasztásra..");

    }

    ;
        
        
        public void tesztKincsBronz() {
        System.out.println("Ha az bronz kerül kiválasztásra..");
    }
        
}   

