package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej3;
import java.util.List;

abstract class Filter {
	
	abstract List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia);
	
}
