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

    public static void main(String[] args) {

    }

    public static void visszajelzes() {

        Kincseslada arany = new Kincseslada(false, "arany");
        Kincseslada ezust = new Kincseslada(true, "ezüst");
        Kincseslada bronz = new Kincseslada(false, "bronz");

        Kincseslada KLT[] = new Kincseslada[3];

        KLT[0] = arany;
        KLT[1] = ezust;
        KLT[2] = bronz;

        for (int i = 0; i < KLT.length; i++) {
            if (KLT[i].vanKincs == true) {
                win();

            } else {
                lost();

            };

        }

    }

    public static void win() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void lost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
