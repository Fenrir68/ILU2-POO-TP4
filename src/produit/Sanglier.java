package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	int poids;
	Gaulois chasseur;
	
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("Sanglier", Unite.kilogramme);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public String decrireProduit() {
		return "Sanglier de "+poids+super.getUnite().toString()+" chassé par "+chasseur.getNom();
	}

	@Override
	public int calculerPrix(int prix) {
		return (int) (prix*poids*super.getUnite().getConvertion());
	}
}
