package extra.oef02;

public class Main {

	public static void main(String[] args) {
		PositieveOpteller opteller = new PositieveOpteller(10);
		
		opteller.toevoegen(10);
		System.out.println(opteller.som());
		opteller.toevoegen(Integer.MAX_VALUE);
	}

}