package exception07;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args)  {
        try {
            String banknaam = JOptionPane.showInputDialog("Geef banknaam");
            Bank b = new Bank(banknaam);
            System.out.println("Bank is opgericht");
        } catch (BankException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
