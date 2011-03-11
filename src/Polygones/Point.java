package Polygones;

/**
 * 
 * Repr�sente un point dans un syst�me de 
 * coordonn�es x et y.
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
	 * @return La coordonn�e X du point.
	 */
	public double getX(){
		return this.x;
	}

	/**
	 * 
	 * @return La coordonn�e Y du point.
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
	 * Renvoie un nouveau Point d�plac�s de	deltaX 
	 * en abcisses et de deltaY en ordonn�es
	 * 
	 * @param deltaX	Le d�placement en abcisses	
	 * @param deltaY	Le d�placement en ordonn�es. 
	 */
	public Point d�place(double deltaX, double deltaY){
		return new Point(this.x + deltaX, this.y + deltaY);
	}
}
