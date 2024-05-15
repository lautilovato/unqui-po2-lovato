package ar.edu.unq.po2.tpComposite.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MixedParcelTestcase {

	private CultivationSystem system;
	private Parcel parcel;
	private PureRegion region1;
	private PureRegion region2;
	private Region region3;
	private Region region4;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		system = new CultivationSystem();
		region1 = new PureRegion(Crop.SOYA);
		region2 = new PureRegion(Crop.WHEAT);
		region3 = new MixedRegion(region1, region1, region2, region2);
		region4 = region1;
		parcel = new Parcel(region1, region2, region3, region4);
		
	}
	
	@Test
	void testProfitForSoya() {
		double amount = system.anualParcelProfitPerSoya(parcel);
		assertEquals(amount, 1250);
	}
	
	@Test
	void testProfitForWheat() {
		double amount = system.anualParcelProfitPerWheat(parcel);
		assertEquals(amount, 450);
	}
}
