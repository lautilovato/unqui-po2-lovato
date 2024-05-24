package ar.edu.unq.po2.tpObserver.Deportes;

import java.util.ArrayList;
import java.util.List;


public class Server extends Observable{
	
	private List<String> sportsOfInterest = new ArrayList<String>();
	private Match lastMatchRegister;
	
	public Server() {
		
	}
	
	public Server(List<String> sportsOfInterest) {
		this.sportsOfInterest = sportsOfInterest;
	}

	public List<String> getSportsOfInterest() {
		return sportsOfInterest;
	}

	public void setSportsOfInterest(List<String> sportsOfInterest) {
		this.sportsOfInterest = sportsOfInterest;
	}

	public Match getLastMatchRegister() {
		return lastMatchRegister;
	}

	public boolean isMatchOfInterest(Match match) {
		
		return this.getSportsOfInterest().contains(match.getSport());
	}
	
	public void registerMatch(Match match) {
		if(this.isMatchOfInterest(match)) {
			this.advice();
		}
	}
	
}
