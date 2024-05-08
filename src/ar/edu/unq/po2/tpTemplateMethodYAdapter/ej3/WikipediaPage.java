package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej3;
import java.util.*;

public interface WikipediaPage {

	String getTitle();
	List <WikipediaPage> getLinks();
	Map<String, WikipediaPage> getInfoBox();

}
