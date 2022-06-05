/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kincskereso.modell;

/**
 *
 * @author makra
 */
public class Kincs {
    boolean van = false;

    public void vanK () {

        Kincseslada arany = new Kincseslada(false, "arany", "Én rejtem a Kincset!");
        Kincseslada ezust = new Kincseslada(true, "ezüst", "Nem én rejtem a kincset!");
        Kincseslada bronz = new Kincseslada(false, "bronz", "Az arany hazudik!");

        Kincseslada KLT[] = new Kincseslada[3];

        KLT[0] = arany;
        KLT[1] = ezust;
        KLT[2] = bronz;

       

        for (int i = 0; i < KLT.length; i++) {
            if (KLT[i].vanKincs == true) {
                van = true;
            } else {
                van = false;
            };

        }
    }

}
