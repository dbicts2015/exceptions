package exception08b;
/*
 bron: http://docs.oracle.com/javase/7/docs/technotes/guides/language/catch-multiple.html
 */

import java.util.Random;

public class Main {
	static Random rnd = new Random();

	public static void main(String[] args) {
		// voor java 7
		try {
			throwsAnException();
		} catch (IndexOutOfBoundsException e) {
			System.err.println("oeps...");
			System.err.println(e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("oeps...");
			System.err.println(e.getMessage());
		}

		// HANDLING MORE THAN ONE TYPE OF EXCEPTION
		// In Java SE 7 and later,
		// a single catch block can handle more than one type of exception.
		try {
			throwsAnException();
		} catch (IndexOutOfBoundsException | NullPointerException e) {
			System.err.println("oeps...");
			System.err.println(e.getMessage());
		}
	}

	static void throwsAnException() {
		if (rnd.nextInt(100) < 50) {
			throw new IndexOutOfBoundsException("fout 1");
		} else {
			throw new NullPointerException("fout 2");
		}
	}
}
