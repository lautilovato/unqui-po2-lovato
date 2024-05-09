package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej3;

import java.util.*;




public class SameInitialLetter extends Filter{
	
	public SameInitialLetter() {
		
	}
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia){
		
		return wikipedia.stream().filter(w -> w.getTitle().charAt(0) == page.getTitle().charAt(0)).toList();
		
	}
	
}