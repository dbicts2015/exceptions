package extra.oef02;

/**
 * Schrijf een klasse PositieveOpteller. De klasse moet een constructor hebben waar we een
 * getal kunnen aan meegeven (moet positief zijn). Via de methode Toevoegen(int getal) moeten
 * we een (positief) getal kunnen optellen bij de huidige som. Voorzie ook een property Som
 * waarmee je de huidige som kunt opvragen. Voorzie de nodige exceptions. Kun je er voor
 * zorgen dat je klasse correct reageert op een OverflowException? (Tip: “checked statement” in
 * .NET help)
 * 
 * @author user104
 *
 */
public class PositieveOpteller {

	private int value;
	
	public PositieveOpteller(int initial_value) {
		this.value = initial_value;
	}

	public void toevoegen(int getal) {
		long totaal = 0L + getal + value;
		if (totaal > Integer.MAX_VALUE) {
			System.out.println("test");
			throw new ArithmeticException("Integer overflow");
		}
		if (getal < 0) {
			throw new IllegalArgumentException("argument < 0");
		}
		value += getal;
	}

	public int som() {
		return value;
	}

}