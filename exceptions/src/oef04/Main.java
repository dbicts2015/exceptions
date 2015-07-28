package oef04;

public class Main {

	public static void main(String[] args) throws TVException {
		TVZender zender = new TVZender();
		
		zender.addProgramma(new TVProgramma("nog wa reclam", 14, 16));
		zender.addProgramma(new TVProgramma("plop", 10, 12));
		zender.addProgramma(new TVProgramma("reclam", 3, 9));
		zender.addProgramma(new TVProgramma("RECLAME", 10, 14));
		
		System.out.println(zender.geefProgrammas());
	}

}