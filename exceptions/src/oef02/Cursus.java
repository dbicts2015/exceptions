package oef02;

import java.util.Arrays;

public class Cursus {

	private String[] cursisten = new String[5];
	
	public void voegCursistToe(String cursist) throws CursusException {
		for (int i = 0; i < cursisten.length; i++) {
			if (cursisten[i] != null && cursisten[i].equals(cursist)) {
				throw new CursusException("Cursisten moeten uniek zijn");
			}
			else if (cursisten[i] == null) {
				cursisten[i] = cursist;
				return;
			}
		}
		throw new CursusException("geen plaats meer voor cursist");
	}
	
	public void schrijfCursistUit(String cursist) throws CursusException {
		for (int i = 0; i < cursisten.length; i++) {
			if (cursisten[i] != null && cursisten[i].equals(cursist)) {
				cursisten[i] = null;
				return;
			}
		}
		throw new CursusException("cursist niet gevonden");
	}

	@Override
	public String toString() {
		return "Cursus [cursisten=" + Arrays.toString(cursisten) + "]";
	}

}