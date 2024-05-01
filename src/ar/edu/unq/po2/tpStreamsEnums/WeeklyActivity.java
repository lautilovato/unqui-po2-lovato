package ar.edu.unq.po2.tpStreamsEnums;

public class WeeklyActivity {
	
	private Day day;
	private	String startTime;
	private int duration; 
	private Sport sport;

	public WeeklyActivity() {
	
	}
	
	public WeeklyActivity(Day day, String startTime, int duration, Sport sport) {
		
		this.day = day;
		this.startTime = startTime;
		this.duration = duration;
		this.sport = sport;
		
	}

	public Day getDay() {
		return day;
	}

	public String getStartTime() {
		return startTime;
	}

	public int getDuration() {
		return duration;
	}
	
	public Sport getSport() {
		return sport;
	}
	
	public double getCost() {
		int hours = this.getDuration();
		int complexity = this.getSport().getComplexity();
		double cost = 0;
		Day day = this.getDay();
	
		if(  (day == Day.MONDAY) || (day == Day.TUESDAY) || (day == Day.WEDNESYDAY) ) {
			cost = (hours * 500)  + (complexity * 200) ;
		}
		else {
			cost = (hours * 1000)  + (complexity * 200);
		}
		
		return cost;
	}	
		
		
}