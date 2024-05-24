package ar.edu.unq.po2.tpObserver.Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Subscription {
	
	private List<String> titles = new ArrayList<String>();	
	private List<String> authors = new ArrayList<String>();	
	private List<String> affiliations = new ArrayList<String>();	
	private List<String> types = new ArrayList<String>();	
	private List<String> publicationPlaces = new ArrayList<String>();	
	private List<String> keywords = new ArrayList<String>();
	
	public Subscription( List<String> titles, List<String> authors, List<String> affiliations,  
			List<String> types,  List<String> publicationPlaces, List<String> keywords) {
		
		this.titles = titles;
		this.authors = authors;
		this.affiliations = affiliations;
		this.types = types;
		this.publicationPlaces = publicationPlaces;
		this.keywords = keywords;
	}

	public List<String> getTitles() {
		return titles;
	}

	public void setTitles(List<String> titles) {
		this.titles = titles;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public List<String> getAffiliations() {
		return affiliations;
	}

	public void setAffiliations(List<String> affiliations) {
		this.affiliations = affiliations;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public List<String> getPublicationPlaces() {
		return publicationPlaces;
	}

	public void setPublicationPlaces(List<String> publicationPlaces) {
		this.publicationPlaces = publicationPlaces;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	
	
}
