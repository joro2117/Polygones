package Polygones;
import java.util.List;

public abstract class Quadrilatère extends Polygone {

	/**
	 * Construit un Quadrilatère en spécifiant un point d'origine et
	 * une liste de point par rapport à cette origine représentant
	 * les sommets du polygone.
	 * 
	 * @param origine	L'origine des sommets
	 * @param sommets	La liste des sommets
	 */
	public Quadrilatère(Point origine, List<Point> sommets) {
		super(origine, sommets);
	}
}
