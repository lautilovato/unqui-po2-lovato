package ar.edu.unq.po2.tpSOLID;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTestCase {

	private Client client;
	
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		client = new Client("lautaro", "lovato", "unq", 21, 3023.77 , 367.25);

	}
	
	@Test
	void test() {

		assertEquals(client.getAnnualNetSalary(), 36285,24);
	}

}
