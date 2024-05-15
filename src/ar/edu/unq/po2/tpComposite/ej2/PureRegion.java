package ar.edu.unq.po2.tpComposite.ej2;

public class PureRegion implements Region{
	
	private Crop crop;
	
	public PureRegion(Crop crop) {
		this.crop = crop;
	}

	public Crop getCrop() {
		return crop;
	}
	
	public double getAnnualProfitPerCrop(Crop crop) {
		double profit = 0;
		
		if(crop == this.getCrop()) {
			profit = this.getCrop().getAnnualProfit();
		}
		
		return profit;
	}
}
