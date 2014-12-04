public class TestMazzo {

	public static void main(String[] args) {
	
		Mazzo m = new Mazzo();
		CartaDaGioco c1 = new CartaDaGioco(1, "Fiori");
		System.out.println(m.gioca(c1));
	
	}//main

}//TestMazzo
