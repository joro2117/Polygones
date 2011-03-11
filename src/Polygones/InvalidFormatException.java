package Polygones;

public class InvalidFormatException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InvalidFormatException(String element){
		super("Invalid format - " + element);
	}
}
