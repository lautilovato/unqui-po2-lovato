package ar.edu.unq.po2.tpStreamsEnums;

public enum DermatologicalLesion {


	RED("description", 5, "Grey"), GREY("description", 4, "Yellow"), YELLOW("description", 3, "Honey"), HONEY("description", 2, "Red");
	
	String description;
	int riskLevel;
	String nextColor;
	
	DermatologicalLesion(String description, int riskLevel,String nextColor){
		this.description = description;
		this.riskLevel = riskLevel;
		this.nextColor = nextColor;
	}
	
	public String getDescription() {
		return description;
	}

	public int getRiskLevel() {
		return riskLevel;
	}
	
	public String getNextColor() {
		return nextColor;
	}
	
	
}
