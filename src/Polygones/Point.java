package Polygones;

/**
 * 
 * Représente un point dans un système de 
 * coordonnées x et y.
 *
 */
public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @return La coordonnée X du point.
	 */
	public double getX(){
		return this.x;
	}

	/**
	 * 
	 * @return La coordonnée Y du point.
	 */
	public double getY(){
		return this.y;
	}

	/**
	 * 
	 * @return La distance entre p1 et p2.
	 */
	public static double getDistance(Point p1, Point p2){
		return Math.hypot((p1.getX() - p2.getX()), (p1.getY() - p2.getY()));
	}

	/**
	 * Renvoie un nouveau Point déplacés de	deltaX 
	 * en abcisses et de deltaY en ordonnées
	 * 
	 * @param deltaX	Le déplacement en abcisses	
	 * @param deltaY	Le déplacement en ordonnées. 
	 */
	public Point déplace(double deltaX, double deltaY){
		return new Point(this.x + deltaX, this.y + deltaY);
	}
}
