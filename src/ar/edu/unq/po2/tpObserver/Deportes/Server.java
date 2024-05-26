package ar.edu.unq.po2.tpObserver.Deportes;

import java.util.ArrayList;
import java.util.List;


public class Server{
	
	private List<String> sportsOfInterest = new ArrayList<String>();
	private Match lastMatchRegister;
	private List<FilterMatch> filters = new ArrayList<FilterMatch>();
	
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
	
	public void setLastMatchRegister(Match lastMatchRegister) {
		this.lastMatchRegister = lastMatchRegister;
	}
	
	public List<FilterMatch> getFilters() {
		return filters;
	}
	
	public void addFilter(FilterMatch filterMatch) {
		filters.add(filterMatch);
	}
	
	public void deleteObserver(FilterMatch filterMatch) {
		filters.remove(filterMatch);
	}

	
	public void advice() {
		for (FilterMatch f:this.getFilters()) {
			f.update();
		}
	}
	public boolean isMatchOfInterest(Match match) {
		
		return this.getSportsOfInterest().contains(match.getSport());
	}
	
	public void registerMatch(Match match) {
		if(this.isMatchOfInterest(match)) {
			this.setLastMatchRegister(match);
			this.advice();
		}
	}

	
}
