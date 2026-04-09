package produit;

public enum Unite {

	gramme("g", 0.001f),
	kilogramme("kg", 1),
	litre("L", 1),
	centilitre("cL", 0.01f),
	millilitre("mL", 0.001f),
	piece("pièce", 1);
	
	private String systemInternational;
	private float convertion;
	
	private Unite(String systemInternational, float convertion) {
		this.systemInternational = systemInternational;
		this.convertion = convertion;
	}
	
	public String toString() {
		return this.systemInternational;
	}
	
	public float getConvertion() {
		return this.convertion;
	}
	
}
