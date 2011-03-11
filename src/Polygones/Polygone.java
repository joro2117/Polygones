package Polygones;
import java.util.ArrayList;
import java.util.List;

public abstract class Polygone {
	
	private List<Point> sommets;
	
	/**
	 * Construit un polygone en spécifiant un point d'origine et
	 * une liste de point par rapport à cette origine représentant
	 * les sommets du polygone.
	 * 
	 * @param origine	L'origine des sommets
	 * @param sommets	La liste des sommets
	 */
	public Polygone(Point origine, List<Point> sommets){
 
		this.sommets = new ArrayList<Point>();
		for (int i = 0; i < sommets.size(); i++){
			this.sommets.add(sommets.get(i).déplace(origine.getX(), origine.getY()));
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
	 * aussi appelé ordre du polygone.
	 * 
	 * @return	L'ordre du polygone.
	 */
	public int getOrdre(){
		return this.sommets.size();
	}
	
	/**
	 * Calcule le périmètre du polygone en sommant les
	 * distance entre les sommets du polygon.
	 * 	 * 
	 * @return	Le périmètre du polygone
	 */
	public double getPérimètre() {

		double resultat = 0;
		
		Point p0 = sommets.get(0);
		Point pointPrécédent = p0;
		
		for (int i = 1; i < this.sommets.size(); i++){
			Point pointCourant = this.sommets.get(i);
			resultat += Point.getDistance(pointPrécédent, pointCourant);
			pointPrécédent = pointCourant;
		}
		
		resultat += Point.getDistance(pointPrécédent, p0); 

		return resultat;
	}
	
	public abstract double getAire();
	
	/**
	 * Déplace le Polygone dont de deltaX en abcisses 
	 * et de deltaY en ordonnées
	 * 
	 * @param deltaX	Le déplacement en abcisses	
	 * @param deltaY	Le déplacement en ordonnées. 
	 */
	public void déplace(double deltaX, double deltaY){

		List<Point> sommetsDéplacés = new ArrayList<Point>(); 

		for (int i = 0; i < this.sommets.size(); i++){
			sommetsDéplacés.add(this.sommets.get(i).déplace(deltaX, deltaY));
		}

		this.sommets = sommetsDéplacés;
	}
}
