package ar.edu.unq.po2.tpComposite.ej2;

public enum Crop {
	
	SOYA(500), WHEAT(300);
	
	private double annualProfit;
	
	Crop(double annualProfit){
		this.annualProfit = annualProfit;
	}

	public double getAnnualProfit() {
		return annualProfit;
	}
}
