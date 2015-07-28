package extra.oef03;

public class Main {

	public static void main(String[] args) {
		Woordenboek wb = new Woordenboek();
		try
		{
			wb.voegVerklaringToe("1", "1");
			wb.voegVerklaringToe("2", "2");
			wb.voegVerklaringToe("3", "3");
			wb.voegVerklaringToe("4", "4");
			wb.voegVerklaringToe("5", "5");
			// wb.VoegVerklaringToe("6", "6");
			String waarde = wb.vraagVerklaring("1");
			System.out.printf("De verklaring van %s is %s%n", "1", waarde);
			waarde = wb.vraagVerklaring("7");
			System.out.printf("De verklaring van %s is %s%n", "7", waarde);
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
		}
	}

}
