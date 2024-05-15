package ar.edu.unq.po2.tpComposite.ej2;

import java.util.ArrayList;
import java.util.List;



public class Parcel {
	private List<Region> regions = new ArrayList<Region>();
	
	public Parcel(Region region1, Region region2, Region region3, Region region4) {
		regions.add(region1);
		regions.add(region2);
		regions.add(region3);
		regions.add(region4);
	}
	
	public List<Region> getRegions() {
		return regions;
	}

	public double getAnnualProfitPerCrop(Crop crop) {
		double profit = 0;
		for(Region region: this.getRegions()) {
			profit = profit + region.getAnnualProfitPerCrop(crop);
		}
		return profit;
	}
}
