package ar.edu.unq.po2.tpComposite.ej2;



public class CultivationSystem {
	
	public CultivationSystem() {
		
	}
	
	public double  anualParcelProfitPerWheat(Parcel parcel) {
		
		return parcel.getAnnualProfitPerCrop(Crop.WHEAT);
		
	}
	
	public double  anualParcelProfitPerSoya(Parcel parcel) {
		
		
		return parcel.getAnnualProfitPerCrop(Crop.SOYA);
	}
}
