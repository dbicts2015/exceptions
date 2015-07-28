package exception03;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String sBedrag = JOptionPane.showInputDialog("Geef bedrag");
        
        try {
        	int bedrag = Integer.parseInt(sBedrag);
        	System.out.println("Het bedrag is "+bedrag);
        } catch (Exception ex) {
        	System.out.println("U moet een geheel getal ingeven.");
        }
    }
}
