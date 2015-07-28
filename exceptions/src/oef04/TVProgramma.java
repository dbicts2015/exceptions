package oef04;

public class TVProgramma {
	private String naam;
	private int beginUur;
	private int eindUur;

	public TVProgramma(String naam, int beginUur, int eindUur) {
		this.naam = naam;
		this.beginUur = beginUur;
		this.eindUur = eindUur;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getBeginUur() {
		return beginUur;
	}

	public void setBeginUur(int beginUur) {
		this.beginUur = beginUur;
	}

	public int getEindUur() {
		return eindUur;
	}

	public void setEindUur(int eindUur) {
		this.eindUur = eindUur;
	}

	@Override
	public String toString() {
		return naam + ": " + beginUur + " - " + eindUur;
	}
}
