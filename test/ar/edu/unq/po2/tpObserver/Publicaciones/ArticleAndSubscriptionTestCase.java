package ar.edu.unq.po2.tpObserver.Publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticleAndSubscriptionTestCase {
	
	private Article article;
	private Subscription sub;
	private Investigator investigator;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		article = new Article("Lala", Arrays.asList("pedro", "juan"), Arrays.asList("Universidad"), "historia", 
							  "Argentina", Arrays.asList("po2", "Java"));
	}
	
	
	@Test
	void testInterestedForTitles() {
		sub = new Subscription(Arrays.asList("Lala", "Patrones de diseño"), Arrays.asList(), Arrays.asList(),  
				Arrays.asList(),  Arrays.asList(), Arrays.asList());
		
		investigator = new Investigator(sub);
		
		boolean result = investigator.interested(article);
		
		assertTrue(result);
	}
	
	@Test
	void testInterestedForAuthors() {
		sub = new Subscription(Arrays.asList(), Arrays.asList("pedro", "borges", "lala"), Arrays.asList(),  
				Arrays.asList(),  Arrays.asList(), Arrays.asList());
		
		investigator = new Investigator(sub);
		
		boolean result = investigator.interested(article);
		
		assertTrue(result);
	}
	
	@Test
	void testInterestedForAffiliations() {
		sub = new Subscription(Arrays.asList(), Arrays.asList(), Arrays.asList("Universidad"),  
				Arrays.asList(),  Arrays.asList(), Arrays.asList());
		
		investigator = new Investigator(sub);
		
		boolean result = investigator.interested(article);
		
		assertTrue(result);
	}
	
	@Test
	void testInterestedForTypes() {
		sub = new Subscription(Arrays.asList(), Arrays.asList(), Arrays.asList(),  
				Arrays.asList("historia", "informatica", "mecanica"),  Arrays.asList(), Arrays.asList());
		
		investigator = new Investigator(sub);
		
		boolean result = investigator.interested(article);
		
		assertTrue(result);
	}

	@Test
	void testInterestedForPublicationsPlaces() {
		sub = new Subscription(Arrays.asList(), Arrays.asList(), Arrays.asList(),  
				Arrays.asList(),  Arrays.asList("Argentina", "Ingkaterra", "Alemania"), Arrays.asList());
		
		investigator = new Investigator(sub);
		
		boolean result = investigator.interested(article);
		
		assertTrue(result);
	}
	
	@Test
	void testInterestedForKeywords(){
		sub = new Subscription(Arrays.asList(), Arrays.asList(), Arrays.asList(),  
				Arrays.asList(),  Arrays.asList(), Arrays.asList("po2"));
		
		investigator = new Investigator(sub);
		
		boolean result = investigator.interested(article);
		
		assertTrue(result);
	}
	
	@Test
	void testInterestedFail(){
		sub = new Subscription(Arrays.asList(), Arrays.asList(), Arrays.asList(),  
				Arrays.asList(),  Arrays.asList(), Arrays.asList());
		
		investigator = new Investigator(sub);
		
		boolean result = investigator.interested(article);
		
		assertFalse(result);
	}
}
