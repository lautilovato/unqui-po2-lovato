package ar.edu.unq.po2.tpObserver.Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Article {
	
	String title;
	private List<String> authors = new ArrayList<String>();	
	private List<String> affiliations = new ArrayList<String>();	
	private String type;
	private String publicationPlace;
	private List<String> keywords = new ArrayList<String>();

	public Article(String title, List<String> authors, List<String> affiliations, String type, String publicationPlace, List<String> keywords) {
		
		this.title = title;
		this.authors = authors;
		this.affiliations = affiliations;
		this.type = type;
		this.publicationPlace = publicationPlace;
		this.keywords = keywords;
	}

	public String getTitle() {
		return title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public List<String> getAffiliations() {
		return affiliations;
	}

	public String getType() {
		return type;
	}

	public String getPublicationPlace() {
		return publicationPlace;
	}

	public List<String> getKeywords() {
		return keywords;
	}
	
	
	
	
	
}
