package oeftijdstip;

public class Tijdsduur {

	private final Tijdstip tijdstip;

	public Tijdsduur(Tijdstip tijdstip) {
		this.tijdstip = tijdstip;
	}

	public Tijdsduur(Tijdstip start, Tijdstip einde) {
		this(einde.subtract(start));
	}

	public String toString() {
		return tijdstip.toString();
	}

}