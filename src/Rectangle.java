import Polygones.ParallÚlogramme;
import Polygones.Point;

public class Rectangle extends ParallÚlogramme{
	
	public Rectangle(Point origine, double a, double b){
		super(origine, a, b, 90);
			
	}
	public final double getB(){
		return getH();
	}
	
}
