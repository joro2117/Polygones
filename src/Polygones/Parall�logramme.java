package Polygones;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Jérôme Frossard
 *
 * Représente un parallèlogramme selong le schéma ci-dessous:
 * 
 * 				 
 *   origine ._____________a___________
 *           /_ /      |              /
 *          /   angle  |             /
 *         /           | h          /  
 *        /____________|___________/
 *    
 */
public class Parallélogramme extends Quadrilatère {

	private double a;
	private double h;
	private int angle;
	
	/**
	 *  
	 * @param origine	Le point d'origine de la figure
	 * @param a			La longueur d'un côté du paralèllograme 
	 * @param h			La hauteur du paralèllogramme
	 * @param angle		L'angle décrit par les côtés au point d'origine.
	 */
	public Parallélogramme(Point origine, double a, double h, int angle) {
		super(origine, calculeSommets(a, h, angle));

		this.a = a;
		this.h = h;
		this.angle = angle;
	}
	
	/**
	 * 
	 * @return La longueur du côté b du parallèlogramme
	 */
	public final double getA(){
		return this.a;
	}

	/**
	 * 
	 * @return La hauteur du parallèlogramme
	 */
	public final double getH(){
		return this.h;
	}

	/**
	 * 
	 * @return L'angle décrit par les côtés du parallèlogramme au point d'origine.
	 */
	public final int getAngle(){
		return this.angle;
	}
	
	/*
	 * Renvoie une liste de sommets à partir de la longeur d'un côté b,
	 * de la hauteur h et de l'angle. L'angle doit être compris entre
	 * 1 et 179 degré.
	 */
	private static List<Point> calculeSommets(double b, double h, int angle) {
	
		double deltaX = 0;
		
		if (angle >= 90){
			deltaX = -h / Math.tan(Math.PI * (180 - angle) / 180);
		} else if (angle < 90){
			deltaX = h / Math.tan(Math.PI * angle / 180);
		}
		
		Point s0 = new Point(0, 0);
		Point s1 = s0.déplace(b, 0);
		Point s2 = s1.déplace(deltaX, h);
		Point s3 = s2.déplace(-b, 0);
		
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
