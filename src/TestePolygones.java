import Polygones.*;

public class TestePolygones {
	
	public static void testeTout() {
		
		try {
			testeParallèlogramme();
			testeRectangle();
			testeCarré();
			testeAire();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
	}
	
//	Décommenter lorsque la classe SimplePolygoneFormat est implémentée.
	
	public static void testeParallèlogramme() throws InvalidFormatException
	{
		Parallélogramme para = new Parallélogramme(new Point(0,0), 10, 7, 135);

		SimplePolygoneFormat monFormat = new SimplePolygoneFormat("périmètre ordre sommets");
		System.out.println("Test Parallèlogramme -----\n");
		System.out.println(monFormat.format(para));
	}
	

//	Décommenter lorsque la classe Rectangle est implémentée.

	public static void testeRectangle() throws InvalidFormatException
	{
		Rectangle rect = new Rectangle(new Point(0,0), 10, 7);

		SimplePolygoneFormat monFormat = new SimplePolygoneFormat("périmètre ordre sommets");
		System.out.println("Test Rectangle -----------\n");
		System.out.println(monFormat.format(rect));
	}


//	Décommenter lorsque la classe Carré est implémentée.
	
	public static void testeCarré() throws InvalidFormatException
	{
		Carré carré = new Carré(new Point(0,0), 10);

		SimplePolygoneFormat monFormat = new SimplePolygoneFormat("périmètre ordre sommets");
		System.out.println("Test Carré ---------------\n");
		System.out.println(monFormat.format(carré));
	}
	
//	Décommenter lorsque la méthode getAire() est implémentée.
	
	public static void testeAire() throws InvalidFormatException
	{
		Carré carré = new Carré(new Point(0,0), 10);
		Rectangle rect = new Rectangle(new Point(0,0), 10, 7);
		Parallélogramme para = new Parallélogramme(new Point(0,0), 10, 7, 135);

		System.out.println("Test Aire ----------------\n");
		System.out.println("Aire Parallélogramme : " + para.getAire());
		System.out.println("Aire Rectangle       : " + rect.getAire());
		System.out.println("Aire Carré           : " + carré.getAire());
	}
}