package ar.edu.unq.po2.tpTemplateMethodYAdapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PassantEmployeeTestCase {

	private PassantEmployee passantEmployee;
	
	@BeforeEach
	public void setUp() throws Exception {
		passantEmployee = new PassantEmployee(40);
	}
	
	
	@Test
	void testGrossSalary() {
		double grossSalary = passantEmployee.grossSalary();
		assertEquals(grossSalary, 1600);
	}
	
	@Test
	void testFinalSalary() {
		double salary = passantEmployee.salary();
		assertEquals(salary, 1392);
	}

}
