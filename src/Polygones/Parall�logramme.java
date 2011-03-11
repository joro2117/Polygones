package Polygones;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author J�r�me Frossard
 *
 * Repr�sente un parall�logramme selong le sch�ma ci-dessous:
 * 
 * 				 
 *   origine ._____________a___________
 *           /_ /      |              /
 *          /   angle  |             /
 *         /           | h          /  
 *        /____________|___________/
 *    
 */
public class Parall�logramme extends Quadrilat�re {

	private double a;
	private double h;
	private int angle;
	
	/**
	 *  
	 * @param origine	Le point d'origine de la figure
	 * @param a			La longueur d'un c�t� du paral�llograme 
	 * @param h			La hauteur du paral�llogramme
	 * @param angle		L'angle d�crit par les c�t�s au point d'origine.
	 */
	public Parall�logramme(Point origine, double a, double h, int angle) {
		super(origine, calculeSommets(a, h, angle));

		this.a = a;
		this.h = h;
		this.angle = angle;
	}
	
	/**
	 * 
	 * @return La longueur du c�t� b du parall�logramme
	 */
	public final double getA(){
		return this.a;
	}

	/**
	 * 
	 * @return La hauteur du parall�logramme
	 */
	public final double getH(){
		return this.h;
	}

	/**
	 * 
	 * @return L'angle d�crit par les c�t�s du parall�logramme au point d'origine.
	 */
	public final int getAngle(){
		return this.angle;
	}
	
	/*
	 * Renvoie une liste de sommets � partir de la longeur d'un c�t� b,
	 * de la hauteur h et de l'angle. L'angle doit �tre compris entre
	 * 1 et 179 degr�.
	 */
	private static List<Point> calculeSommets(double b, double h, int angle) {
	
		double deltaX = 0;
		
		if (angle >= 90){
			deltaX = -h / Math.tan(Math.PI * (180 - angle) / 180);
		} else if (angle < 90){
			deltaX = h / Math.tan(Math.PI * angle / 180);
		}
		
		Point s0 = new Point(0, 0);
		Point s1 = s0.d�place(b, 0);
		Point s2 = s1.d�place(deltaX, h);
		Point s3 = s2.d�place(-b, 0);
		
		List<Point> sommets = new ArrayList<Point>();
		sommets.add(s0);
		sommets.add(s1);
		sommets.add(s2);
		sommets.add(s3);
		
		return sommets;
	}

	@Override
	public double getAire() {
	
		double aire = 0.0;
		
		aire = a*h;
		
		return aire;
	}
	
}
