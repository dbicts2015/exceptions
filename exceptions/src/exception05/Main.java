package exception05;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int getal1 = vraagGetal("Eerste getal");
		int getal2 = vraagGetal("Tweede getal");
		int som = getal1 + getal2;
		System.out.format("De som van %1$d en %2$d is %3$d%n", getal1, getal2, som);
		System.out.println("Einde van programma");
	}

	public static int vraagGetal(String prompt) {
		try {
			return  Integer.parseInt(JOptionPane.showInputDialog(prompt));
		} catch (Exception ex) {
			return vraagGetal(prompt);
		}
	}
}
