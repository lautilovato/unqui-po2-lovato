package ar.edu.unq.po2.tpComposite.ej2;

import java.util.ArrayList;
import java.util.List;




public class MixedRegion implements Region{
	
	private List<PureRegion> subRegions = new ArrayList<PureRegion>();
	
	public MixedRegion(PureRegion subRegion1, PureRegion subRegion2, PureRegion subRegion3, PureRegion subRegion4) {
		
		subRegions.add(subRegion1);
		subRegions.add(subRegion2);
		subRegions.add(subRegion3);
		subRegions.add(subRegion4);
	}

	public List<PureRegion> getSubRegions() {
		return subRegions;
	}
	
	public double getAnnualProfitPerCrop(Crop crop) {
		double profit = 0;
		
		for(PureRegion subRegion: this.getSubRegions()) {
			if(subRegion.getCrop() == crop) {
				profit = profit + crop.getAnnualProfit();
			}
		}
		
		return profit / 4;
	}
	
}
