package cursus;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cursist {

	private String naam;
	private String email;
	
	private final Map<String, Integer> punten = new HashMap<>();

	public Cursist(String naam, String email) throws CursistVerkeerdeEmailException, CursistLegeNaamException {
		this.setNaam(naam);
		this.setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws CursistVerkeerdeEmailException {
		if ((email == null || email.equals("")) && email.contains("@")) {
			throw new CursistVerkeerdeEmailException();
		}
		this.email = email;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) throws CursistLegeNaamException {
		if (naam == null || naam.equals("")) {
			throw new CursistLegeNaamException();
		}
		this.naam = naam;
	}

	public void voegPuntenToe(String cursus, int punten) {
		this.punten.put(cursus, punten);
	}

	public double berekenGemiddelde() {
		double totaal = 0;
		for (Entry<String, Integer> entries : punten.entrySet()) {
			totaal += entries.getValue();
		}
		return totaal / punten.size();
	}

	@Override
	public String toString() {
		return "Cursist [naam=" + naam + ", email=" + email + ", punten=" + punten + "]";
	}

}
