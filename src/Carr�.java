import Polygones.Parallélogramme;
import Polygones.Point;

public class Carré extends Parallélogramme{

	public Carré(Point origine, double c) {
		super(origine, c, c, 90);
	}
	
	public final double getC(){
		return getA();
	}
}
