package paket;

public class Test {

	public static void main(String[] args) {
		Point point1 = new Point();
		// point1.x = 10 NIJEDNO NI DRUGO NE MOZE JER SU OBELEZJA ZA PTISTUP PRIVATE STO
		// ZNACI DA
		// SE OVIM PROMENLJIVIMA MOZE PRISTUPITI SAMO IZ KLASE POINT
		// point1.y = 10

		// ZBOG TOGA SE KORISTE GETERI I SETERI ZATO STO PREKO NJIH MOZEMO DA MENJAMO
		// VREDNOSTI PROMENLJIVIH JER JE KOD NJIH PRISTUP PUBLIC
		// OVO SE ZOVE ENKAPSULACIJA
		// ZA FORMATIRANJE KODA KORISTITI PRECICU SHIFT+CTRL+F
		point1.setX(10);
		point1.setY(5);
		System.out.println("X koordinata tacke je: " + point1.getX());
		System.out.println("Y koordinata tacke je: " + point1.getY());
		System.out.println("Da li je tacka selektovana? " + point1.isSelected());
		
		double distanceResult = point1.distance(15,7);
		System.out.println(distanceResult);
		
		System.out.println(point1);
		
	}

}
