package exception02;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String naam = JOptionPane.showInputDialog("Geef naam");
        int saldo = Integer.parseInt(JOptionPane.showInputDialog("Geef saldo"));
        Bank b = new Bank();
        b.setNaam(naam);
        int error = b.setSaldo(saldo);
        if (error == 0){
            System.out.println("aanmaken gelukt");
        }else{
            System.out.println("aanmaken is niet gelukt");
        }
    }

}
