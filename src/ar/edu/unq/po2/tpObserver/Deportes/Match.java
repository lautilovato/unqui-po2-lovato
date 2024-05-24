package ar.edu.unq.po2.tpObserver.Deportes;

import java.util.ArrayList;
import java.util.List;


public class Match {
	
	private String result;
	private List<String> opponents = new ArrayList<String>();
	private String sport;
	
	public Match() {
		
	}
	
	public Match(String result, List<String> opponents, String sport) {
		this.result = result;
		this.opponents = opponents;
		this.sport = sport;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<String> getOpponents() {
		return opponents;
	}

	public void setOpponents(List<String> opponents) {
		this.opponents = opponents;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
	
	

}
