package ar.edu.unq.po2.tpSOLID;

public interface Credit {

	public Client getClient();
	public double getMonthlyFee();
	public double getAmount();
	public boolean meetRequeriments();

}
