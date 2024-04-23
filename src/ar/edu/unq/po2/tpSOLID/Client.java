package ar.edu.unq.po2.tpSOLID;

public class Client {
	
	String name;
	String lastName;
	String address;
	int age;
	double monthlyNetSalary;
	double moneyBag;

	public Client() {
		
	}
	
	public Client(String name, String lastName, String address, int age, double monthlyNetSalary, double moneyBag) {
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.monthlyNetSalary = monthlyNetSalary;
		this.moneyBag = moneyBag;
		
	}

	public double getAge() {
		return age;
	}
	
	public double getMonthlyNetSalary() {
		return monthlyNetSalary;
	}
	
	public double getAnnualNetSalary() {
		return this.getMonthlyNetSalary() * 12;
	}
	
	public double getMoneyBag() {
		return moneyBag;
	}

	public void setMoneyBag(double moneyBag) {
		this.moneyBag = moneyBag;
	}
	
	public void applyForCredit(Bank bank, Credit credit) {
		
	}

}



