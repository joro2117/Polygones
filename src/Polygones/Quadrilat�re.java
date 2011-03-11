package Polygones;
import java.util.List;

public abstract class Quadrilat�re extends Polygone {

	/**
	 * Construit un Quadrilat�re en sp�cifiant un point d'origine et
	 * une liste de point par rapport � cette origine repr�sentant
	 * les sommets du polygone.
	 * 
	 * @param origine	L'origine des sommets
	 * @param sommets	La liste des sommets
	 */
	public Quadrilat�re(Point origine, List<Point> sommets) {
		super(origine, sommets);
	}
}
