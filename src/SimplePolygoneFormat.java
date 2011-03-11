import java.text.DecimalFormat;
import java.util.List;

import Polygones.InvalidFormatException;
import Polygones.Point;
import Polygones.Polygone;


public class SimplePolygoneFormat {

	private String[] formatParts;
	
	public SimplePolygoneFormat(String formatParts){
	 this.formatParts = formatParts.split(" ");
 }
 
 public String format(Polygone polygone)throws InvalidFormatException{
	 String format = "";
	 for (int i = 0; i< formatParts.length; i++){
		 if(formatParts[i].equalsIgnoreCase("ordre")){
			 format = format + formatOrdre(polygone.getOrdre());
		 }
		 else if (formatParts[i].equalsIgnoreCase("sommets")){
			 format = format + formatSommets(polygone.getSommets());
		 }
		 else if (formatParts[i].equalsIgnoreCase("p�rim�tre")){
			 format = format + formatPerim�tre(polygone.getP�rim�tre());
		 }
		 else{
			 throw new InvalidFormatException(formatParts[i]);
		 }
	 }
	 return format;
 }

	private String formatPerim�tre(double p�rim�tre) {
		DecimalFormat numberFormat = new DecimalFormat("0.0");
		String formatPerim�tre = "";
		formatPerim�tre = "Perim�tre: " + numberFormat.format(p�rim�tre) + " unit�\n";
		
		return formatPerim�tre;
	}

	private String formatSommets(List<Point> sommets) {
		DecimalFormat numberFormat = new DecimalFormat("0.0");
		
		String formatSommets = "Sommets: {";
			for(Point sommet : sommets){
				formatSommets = formatSommets + "(" + numberFormat.format(sommet.getX()) 
											  + "," + numberFormat.format(sommet.getY()) +")";
			}
			
		formatSommets = formatSommets + "}\n";
		return formatSommets;
	}
	
	private String formatOrdre(int ordre) {
			String formatOrdre = "";
			
			formatOrdre = "ordre : " + ordre + "\n";
		return formatOrdre;
	}
}
