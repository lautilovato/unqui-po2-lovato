package ar.edu.unq.po2.tpSOLID;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Client> clients = new ArrayList<Client>();
	private List<Credit> credits = new ArrayList<Credit>();
	private double moneyBag;
	
	
	public Bank() {
		
	}
	
	public Bank(double moneyBag) {
		
		this.moneyBag = moneyBag;
	}
	
	public void addClient(Client client) {
		clients.add(client);
	}
	
	public List<Credit> getCredits() {
		return credits;
	}
	
	public void setCredits(List<Credit> credits) {
		this.credits = credits;
	}
	
	public double getMoneyBag() {
		return moneyBag;
	}

	public void setMoneyBag(double moneyBag) {
		this.moneyBag = moneyBag;
	}

	public void registerCreditApplication(Credit credit) {
		credits.add(credit);
	}
	
	public void evaluateCredit(Credit credit) {
		double bankMoneyBag = this.getMoneyBag();
		double clientMoneyBag = credit.getClient().getMoneyBag();
		if(credit.meetRequeriments()) {
			credit.getClient().setMoneyBag( clientMoneyBag + credit.getAmount() );
			this.setMoneyBag(bankMoneyBag - credit.getAmount());
		}

	}
	
	public void evaluateCreditsApplication() {
		for(Credit c : this.getCredits()) {
			this.evaluateCredit(c);
		}
		this.setCredits(new ArrayList<Credit>());
			
	}
	

}
