package cartes;

public abstract class Carte {

	protected String nom;

	protected Carte(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public String toString() {
		return "Carte " + this.nom;
	}

}
