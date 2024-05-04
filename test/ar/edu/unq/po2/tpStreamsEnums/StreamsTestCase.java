package ar.edu.unq.po2.tpStreamsEnums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;


class StreamsTestCase {
	
	private WeeklyActivity soccer1;
	private WeeklyActivity soccer2;
	private WeeklyActivity running1;
	
	private List<WeeklyActivity> activities;
	
	private Municipality municipality;
	
	@BeforeEach
	public void setUp() throws Exception {
	
		soccer1 = new WeeklyActivity(Day.FRIDAY, "19:30", 1, Sport.SOCCER);
		soccer2 = new WeeklyActivity(Day.MONDAY, "19:30", 2, Sport.SOCCER);
		running1 = new WeeklyActivity(Day.SATURDAY, "19:30", 2, Sport.RUNNING);
		
		activities = Arrays.asList(soccer1, soccer2, running1);
		
		municipality = new Municipality(activities);
	}
	
	@Test
	void testSoccerActivities() {
		
		assertEquals(municipality.getSoccerActivities().size(), 2);
		assertTrue(municipality.getSoccerActivities().contains(soccer1));
		assertTrue(municipality.getSoccerActivities().contains(soccer2));
		
	}

}
