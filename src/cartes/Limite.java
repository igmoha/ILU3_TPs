package cartes;

public abstract class Limite extends Carte {
	
	protected Limite(String nom){super(nom);}
	@Override
    public String toString() {
        return getNom();
    }

}
