package cursus;

import java.util.Arrays;

public class Cursus {

	private final Cursist[] cursisten;
	private final String[] cursussen;

	public Cursus(Cursist[] cursisten, String[] cursussen) {
		this.cursisten = cursisten;
		this.cursussen = cursussen;
	}

	public void voegPuntenToe(int punten, Cursist cursist, String cursus) throws CursusOnbestaandeCursusException, CursusOnbestaandeCursistException {
		if (getIndex(cursussen, cursus) < 0) {   
			throw new CursusOnbestaandeCursusException();
		}
		if (getIndex(cursisten, cursist) < 0) {
			throw new CursusOnbestaandeCursistException();
		}
		cursisten[getIndex(cursisten, cursist)].voegPuntenToe(cursus, punten);
	}

	public double geefGemiddelde(Cursist cursist) throws CursusOnbestaandeCursistException {
		if (getIndex(cursisten, cursist) < 0) {
			throw new CursusOnbestaandeCursistException();
		}
		return cursisten[getIndex(cursisten, cursist)].berekenGemiddelde();
	}

	private int getIndex(Object[] objects, Object object) {
		for (int index = 0; index < objects.length; index++) {
			if (objects != null && objects[index].equals(object)) {
				return index;
			}
		}
		return -1;
	}

}