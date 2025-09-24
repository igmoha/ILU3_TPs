package cartes;

public abstract class Bataille extends Probleme {

	protected Bataille(String nom ,Type type) {
		super(nom ,type);
		
	}
	 @Override
	    public String toString() {
	        return getNom();
	    }
	
	
}
