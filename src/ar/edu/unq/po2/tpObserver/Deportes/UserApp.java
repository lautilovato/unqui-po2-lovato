package ar.edu.unq.po2.tpObserver.Deportes;

import java.util.ArrayList;
import java.util.List;

public class UserApp{
	
	private Server server;
	private List<String> sportsOfInterest = new ArrayList<String>();
	private List<String> opponentsOfInterest = new ArrayList<String>();
	
	private List<Match> matchesOfInterest = new ArrayList<Match>(); 
	
	
	public UserApp(Server server, List<String> sportsOfInterest, List<String> opponentsOfInterest) {
		
		this.server = server;
		this.sportsOfInterest = sportsOfInterest;
		this.opponentsOfInterest = opponentsOfInterest;
		
		server.addFilter(new FilterMatch(this));
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
	
	public void addMatchInterest(Match match) {
		this.matchesOfInterest.add(match);
	}

}

