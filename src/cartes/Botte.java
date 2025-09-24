package cartes;

public class Botte extends Probleme {

	public Botte(String nom , Type type) {
		super(nom ,type);
	
	}
	
	@Override
    public String toString() {
        return getNom();
    }
}
