package ar.edu.unq.po2.tpStreamsEnums;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Municipality {
	
	private List<WeeklyActivity> weeklyActivities = new ArrayList<WeeklyActivity>();

	
	public Municipality() {
		
	}
	
	public Municipality(List<WeeklyActivity> weeklyActivities) {
		this.weeklyActivities = weeklyActivities;
	}

	public List<WeeklyActivity> getWeeklyActivities() {
		return weeklyActivities;
	}
	
	public List<WeeklyActivity> getSoccerActivities() {
		
		Stream<WeeklyActivity> weeklyActivities = this.getWeeklyActivities().stream();	
		
		return weeklyActivities.filter(a -> a.getSport() == Sport.SOCCER).toList();
	}
	
	public List<WeeklyActivity> getActivitiesWithComplexity(int complexity){
		
		Stream<WeeklyActivity> weeklyActivities = this.getWeeklyActivities().stream();
		
		return weeklyActivities.filter(a -> a.getSport().getComplexity() == complexity).toList();
	}
	
	public int getTotalHoursInActivities(){
		
		List<Integer> durations = new ArrayList<Integer>();
		
		Stream<WeeklyActivity> weeklyActivities = this.getWeeklyActivities().stream();
		
		weeklyActivities.forEach(wa -> durations.add(wa.getDuration() ) );
		
		int totalHours = durations.stream().reduce(0, (acumulated , newDuration ) -> acumulated + newDuration);
		
		return totalHours;
	}
	
	public WeeklyActivity getLowestCostActivityForSport(Sport sport){
		
		List <WeeklyActivity> activities = this.getWeeklyActivities();
		WeeklyActivity lowestCostActivity = activities.getFirst();
		for(WeeklyActivity wa: activities) {
			if(wa.getCost() < lowestCostActivity.getCost() && wa.getSport() == sport) {
				lowestCostActivity = wa;
			}
		}
		return lowestCostActivity;
	}
	
}	