package cartes;

public class Attaque extends Bataille {

	public Attaque(String nom , Type type) {
		super(nom , type);
	}
	 @Override
	    public String toString() {
	        return getNom();
	    }

}
