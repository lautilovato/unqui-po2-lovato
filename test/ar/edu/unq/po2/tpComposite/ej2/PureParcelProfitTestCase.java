package ar.edu.unq.po2.tpComposite.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PureParcelProfitTestCase {

	private CultivationSystem system;
	private Parcel parcel;
	private Region region;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		system = new CultivationSystem();
		region = new PureRegion(Crop.SOYA);
		parcel = new Parcel(region, region, region, region);
		
	}
	
	@Test
	void testWhenIsPureParcel() {
		double amount = system.anualParcelProfitPerSoya(parcel);
		assertEquals(amount, 2000);
	}

}
