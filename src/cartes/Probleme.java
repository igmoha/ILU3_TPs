package cartes;

public abstract class Probleme extends Carte {
	
	private Type type ;
	

	protected Probleme(String nom , Type type) {
		super(nom);
		this.type = type;
	}
	
	public Type getType() {
		return this.type ;
	} 

}
