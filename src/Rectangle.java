import Polygones.Parall�logramme;
import Polygones.Point;

public class Rectangle extends Parall�logramme{
	
	public Rectangle(Point origine, double a, double b){
		super(origine, a, b, 90);
			
	}
	public final double getB(){
		return getH();
	}
	
}
