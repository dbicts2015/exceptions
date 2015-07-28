package extra.oef04;

import java.util.Scanner;

public class Main {

	/**
	 * 1. Nieuwe BankRekening aanmaken
	 * 2. Toon lijst
	 * 3. Schrijf over
	 * 0. Stoppen
	 * Uw keuze:
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. Nieuwe bankrekening aanmaken");
			System.out.println("2. Toon lijst");
			System.out.println("3. Schrijf over");
			System.out.println("0. Stoppen");
			
			String keuze = query("Uw keuze", scanner);
			switch (keuze) {
			case "1":
				
				break;
			case "2":
				break;
			case "3":
				break;
			case "0":
				return;
			default:
				System.out.println("Dit is geen geldige keuze.");
				break;
			}
		}
	}

	private static String query(String query, Scanner scanner) {
		System.out.print(query + ": ");
		return scanner.nextLine();
	}

}