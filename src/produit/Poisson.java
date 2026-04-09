package produit;

public class Poisson extends Produit{
	private String date;
	
	public Poisson(String date) {
		super("Poisson", Unite.piece);
		this.date = date;
	}

	@Override
	public String decrireProduit() {
		return "Poisson pêchés le "+date;
	}

}
