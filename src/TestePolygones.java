import Polygones.*;

public class TestePolygones {
	
	public static void testeTout() {
		
		try {
			testeParall�logramme();
			testeRectangle();
			testeCarr�();
			testeAire();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
	}
	
//	D�commenter lorsque la classe SimplePolygoneFormat est impl�ment�e.
	
	public static void testeParall�logramme() throws InvalidFormatException
	{
		Parall�logramme para = new Parall�logramme(new Point(0,0), 10, 7, 135);

		SimplePolygoneFormat monFormat = new SimplePolygoneFormat("p�rim�tre ordre sommets");
		System.out.println("Test Parall�logramme -----\n");
		System.out.println(monFormat.format(para));
	}
	

//	D�commenter lorsque la classe Rectangle est impl�ment�e.

	public static void testeRectangle() throws InvalidFormatException
	{
		Rectangle rect = new Rectangle(new Point(0,0), 10, 7);

		SimplePolygoneFormat monFormat = new SimplePolygoneFormat("p�rim�tre ordre sommets");
		System.out.println("Test Rectangle -----------\n");
		System.out.println(monFormat.format(rect));
	}


//	D�commenter lorsque la classe Carr� est impl�ment�e.
	
	public static void testeCarr�() throws InvalidFormatException
	{
		Carr� carr� = new Carr�(new Point(0,0), 10);

		SimplePolygoneFormat monFormat = new SimplePolygoneFormat("p�rim�tre ordre sommets");
		System.out.println("Test Carr� ---------------\n");
		System.out.println(monFormat.format(carr�));
	}
	
//	D�commenter lorsque la m�thode getAire() est impl�ment�e.
	
	public static void testeAire() throws InvalidFormatException
	{
		Carr� carr� = new Carr�(new Point(0,0), 10);
		Rectangle rect = new Rectangle(new Point(0,0), 10, 7);
		Parall�logramme para = new Parall�logramme(new Point(0,0), 10, 7, 135);

		System.out.println("Test Aire ----------------\n");
		System.out.println("Aire Parall�logramme : " + para.getAire());
		System.out.println("Aire Rectangle       : " + rect.getAire());
		System.out.println("Aire Carr�           : " + carr�.getAire());
	}
}