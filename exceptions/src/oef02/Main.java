package oef02;

public class Main {

	public static void main(String[] args) {
		Cursus cursus = new Cursus();

		try {
			cursus.voegCursistToe("hannes");
			cursus.voegCursistToe("fred");
			cursus.voegCursistToe("karel");
			cursus.voegCursistToe("patrick");
			cursus.voegCursistToe("patrick");
			cursus.voegCursistToe("floor");
			cursus.voegCursistToe("marie");
		} catch (CursusException e) {
			e.printStackTrace();
		}
		
		System.out.println(cursus);
		
		try {
			cursus.schrijfCursistUit("hannes");
			cursus.schrijfCursistUit("rolf");
		} catch (CursusException ex) {
			ex.printStackTrace();
		}
		
		System.out.println(cursus);
		
	}

}