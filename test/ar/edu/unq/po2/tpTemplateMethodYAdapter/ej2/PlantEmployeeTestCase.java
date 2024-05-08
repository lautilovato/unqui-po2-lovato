package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpTemplateMethodYAdapter.ej2.PlantEmployee;

class PlantEmployeeTestCase {

	private PlantEmployee plantEmployee;
	
	@BeforeEach
	public void setUp() throws Exception {
		plantEmployee = new PlantEmployee(2);
	}
	
	@Test
	void testGrossSalary() {
		double grossSalary = plantEmployee.grossSalary();
		assertEquals(grossSalary, 3300);
	}
	
	@Test
	void testFinalSalary() {
		double salary = plantEmployee.salary();
		assertEquals(salary, 2871);
	}

}
