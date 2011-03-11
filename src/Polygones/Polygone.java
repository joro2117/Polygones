package Polygones;
import java.util.ArrayList;
import java.util.List;

public abstract class Polygone {
	
	private List<Point> sommets;
	
	/**
	 * Construit un polygone en sp�cifiant un point d'origine et
	 * une liste de point par rapport � cette origine repr�sentant
	 * les sommets du polygone.
	 * 
	 * @param origine	L'origine des sommets
	 * @param sommets	La liste des sommets
	 */
	public Polygone(Point origine, List<Point> sommets){
 
		this.sommets = new ArrayList<Point>();
		for (int i = 0; i < sommets.size(); i++){
			this.sommets.add(sommets.get(i).d�place(origine.getX(), origine.getY()));
		}
	}
	
	/**
	 * Renvoie la liste des sommets du polygone.
	 * 
	 * @return La liste des sommets
	 */
	public List<Point> getSommets(){
		return this.sommets;
	}
	
	/**
	 * Renvoie le nombre de sommets du polygone, 
	 * aussi appel� ordre du polygone.
	 * 
	 * @return	L'ordre du polygone.
	 */
	public int getOrdre(){
		return this.sommets.size();
	}
	
	/**
	 * Calcule le p�rim�tre du polygone en sommant les
	 * distance entre les sommets du polygon.
	 * 	 * 
	 * @return	Le p�rim�tre du polygone
	 */
	public double getP�rim�tre() {

		double resultat = 0;
		
		Point p0 = sommets.get(0);
		Point pointPr�c�dent = p0;
		
		for (int i = 1; i < this.sommets.size(); i++){
			Point pointCourant = this.sommets.get(i);
			resultat += Point.getDistance(pointPr�c�dent, pointCourant);
			pointPr�c�dent = pointCourant;
		}
		
		resultat += Point.getDistance(pointPr�c�dent, p0); 

		return resultat;
	}
	
	public abstract double getAire();
	
	/**
	 * D�place le Polygone dont de deltaX en abcisses 
	 * et de deltaY en ordonn�es
	 * 
	 * @param deltaX	Le d�placement en abcisses	
	 * @param deltaY	Le d�placement en ordonn�es. 
	 */
	public void d�place(double deltaX, double deltaY){

		List<Point> sommetsD�plac�s = new ArrayList<Point>(); 

		for (int i = 0; i < this.sommets.size(); i++){
			sommetsD�plac�s.add(this.sommets.get(i).d�place(deltaX, deltaY));
		}

		this.sommets = sommetsD�plac�s;
	}
}
