package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilterSameInitialLetterTestCase {

	private SameInitialLetter filter;
	private WikipediaPage page1;
	private WikipediaPage page2;
	private WikipediaPage page3;
	private WikipediaPage page4;
	
	@BeforeEach
	public void setUp() throws Exception {
		filter = new SameInitialLetter();
		
		page1 = mock(WikipediaPage.class);
		page2 = mock(WikipediaPage.class);
		page3 = mock(WikipediaPage.class);
		page4 = mock(WikipediaPage.class);
	}
	
	
	@Test
	void testSimilarPages() {
		when(page1.getTitle()).thenReturn("Leo Messi");
		when(page2.getTitle()).thenReturn("Universidad de Quilmes");
		when(page3.getTitle()).thenReturn("La Plata");
		when(page4.getTitle()).thenReturn("La Scalonetta");
		
		
		List<WikipediaPage> result = filter.getSimilarPages(page1, Arrays.asList( page2, page3, page4));
		
		verify(page1, times(3)).getTitle();
		verify(page2).getTitle();
		verify(page3).getTitle();
		verify(page4).getTitle(); 
		
		assertEquals(result, Arrays.asList(page3, page4));
				
	}

}
