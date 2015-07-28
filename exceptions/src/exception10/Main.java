package exception10;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {
            int quotient = deelGetallen();
        } catch (ArithmeticException ae) {
            System.out.println("U kan niet delen door 0");
        }
    }
    public static int deelGetallen() {
        int getal1 = Integer.parseInt(JOptionPane.showInputDialog("Geef getal1"));
        int getal2 = Integer.parseInt(JOptionPane.showInputDialog("Geef getal2"));
        try {
            int quotient = getal1 / getal2;
            return quotient;
        } finally {
            System.out.println("Dit wordt altijd uitgevoerd");
        }
    }
}
