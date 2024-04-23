package ar.edu.unq.po2.tpSOLID;

public class Property {
	String address;
	double fiscalValue;
	
	public Property(String address, double fiscalValue) {
		this.address = address;
		this.fiscalValue = fiscalValue;
	}

	public double getFiscalValue() {
		return fiscalValue;
	}

}
