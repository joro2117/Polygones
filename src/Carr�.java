import Polygones.Parall�logramme;
import Polygones.Point;

public class Carr� extends Parall�logramme{

	public Carr�(Point origine, double c) {
		super(origine, c, c, 90);
	}
	
	public final double getC(){
		return getA();
	}
}
