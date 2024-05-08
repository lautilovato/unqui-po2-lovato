package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpTemplateMethodYAdapter.ej2.TemporaryEmployee;

class TemporaryEmployeeTestCase {

	private TemporaryEmployee temporaryEmployee;
	

	@BeforeEach
	public void setUp() throws Exception {
		temporaryEmployee = new TemporaryEmployee(40, true);
	}
	
	@Test
	void testGrossSalary() {
		double grossSalary = temporaryEmployee.grossSalary();
		assertEquals(grossSalary, 1300);
		
	}
	
	@Test
	void testFinalSalary() {
		double salary = temporaryEmployee.salary();
		assertEquals(salary, 1131);
		
	}


}
