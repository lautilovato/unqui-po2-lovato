package ar.edu.unq.po2.tpComposite.ej4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FyleSystemTestCase {

	private Archive archive1;
	private Archive archive2;
	private Archive archive3;
	private Archive archive4;
	private Archive archive5;
	
	private Directory directory1;
	private Directory directory2;
	
	private FyleSystem fs;
	
	
	@BeforeEach
	public void setUp() throws Exception { 
		archive1 = new Archive("lala", 3);
		archive2 = new Archive("lalo", 4);
		archive3 = new Archive("lale", 5);
		archive4 = new Archive("lali", 6);
		archive5 = new Archive("lale", 7);
		
		directory1 = new Directory("lals", Arrays.asList(archive1, archive2)); 
		directory2 = new Directory("la", Arrays.asList(archive3, archive4, directory1)); 
		
		fs = new FyleSystem(Arrays.asList(directory2, archive5));
		
	}
	
	@Test
	void testTotalSizeFyleSysystem() {
		int size = fs.getTotalSize();
		assertEquals(size, 25);
	}

}
