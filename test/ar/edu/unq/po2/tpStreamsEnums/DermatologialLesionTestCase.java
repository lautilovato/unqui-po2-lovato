package ar.edu.unq.po2.tpStreamsEnums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DermatologialLesionTestCase {

	private DermatologicalLesion lesion;
	
	@BeforeEach
	public void setUp() throws Exception {

		lesion = DermatologicalLesion.RED;
	}
	
	@Test
	void testDescription() {
		String description = lesion.getDescription();
		assertEquals(description, "description");
	}
	
	@Test
	void testRiskLevel() {
		int riskLevel = lesion.getRiskLevel();
		assertEquals(riskLevel, 5);
	}
	
	@Test
	void testNextColor() {
		String nextColor = lesion.getNextColor();
		assertEquals(nextColor, "Grey");
	}
	

}
