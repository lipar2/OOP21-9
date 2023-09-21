package prodavnicapaket;

public class ProdavnicaTest {

	public static void main(String[] args) {
		ProdavnicaKlasa klasa1 = new ProdavnicaKlasa();

		klasa1.setX(50);
		klasa1.setY(10);
		klasa1.setPokazivac(true);

		System.out.println("Broj zaposlenih u prodavnici je: " + klasa1.getX());
		System.out.println("Broj kasa je: " + klasa1.getY());
		System.out.println("Da li na Adamovicevom naselju ima preko 10 prodavnica: " + klasa1.isPokazivac());

		System.out.println(klasa1);
	}

}
