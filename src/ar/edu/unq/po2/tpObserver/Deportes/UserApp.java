package ar.edu.unq.po2.tpObserver.Deportes;

import java.util.ArrayList;
import java.util.List;

public class UserApp implements Observer{
	
	private Server server;
	private List<String> sportsOfInterest = new ArrayList<String>();
	private List<String> opponentsOfInterest = new ArrayList<String>();
	private List<Match> matchesOfInterest = new ArrayList<Match>(); 
	
	
	public UserApp(Server server, List<String> sportsOfInterest) {
		
		this.server = server;
		this.sportsOfInterest = sportsOfInterest;
	}
	
	public Server getServer() {
		return server;
	}

	public List<String> getSportsOfInterest() {
		return sportsOfInterest;
	}

	public List<String> getOpponentsOfInterest() {
		return opponentsOfInterest;
	}

	public List<Match> getMatchesOfInterest() {
		return matchesOfInterest;
	}

	public boolean isMatchOfInterest(Match match) {
		
		return this.getSportsOfInterest().contains(match.getSport()) || 
				this.getOpponentsOfInterest().stream().anyMatch(opponent -> match.getOpponents().contains(opponent));		
	}
	
	public void update() {
		if( this.isMatchOfInterest( this.getServer().getLastMatchRegister()) ) {
			matchesOfInterest.add(this.getServer().getLastMatchRegister());
		}
	}
}

