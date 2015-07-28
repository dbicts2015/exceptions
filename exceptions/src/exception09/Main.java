package exception09;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        double frekwentie;
        frekwentie = Double.parseDouble(JOptionPane.showInputDialog("Geef frekwentie"));
        while(frekwentie < Radio.MINIMUM_FREKWENTIE || frekwentie > Radio.MAXIMUM_FREWKENTIE){
            JOptionPane.showMessageDialog(null, "Frekwentie moet tussen "+Radio.MINIMUM_FREKWENTIE
                     + " en " + Radio.MAXIMUM_FREWKENTIE+ " liggen.");
            frekwentie = Double.parseDouble(JOptionPane.showInputDialog("Geef frekwentie"));
        }
        radio.setFrekwentie(frekwentie);
        System.out.println(radio.speelRadio());

    }
}
