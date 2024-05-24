package ar.edu.unq.po2.tpObserver.Publicaciones;

import java.util.ArrayList;
import java.util.List;


public class PublicationSystem {
	
	private List<Article> articles = new ArrayList<Article>();
	private List<Subscriber> subscribers  = new ArrayList<Subscriber>();
	
	public PublicationSystem() {
		
	}

	public List<Article> getArticles() {
		return articles;
	}

	public List<Subscriber> getSubscribers() {
		return subscribers;
	}
	
	public void registerSubscriber(Subscriber subscriber) {
		subscribers.add(subscriber);
	}
	
	public void unregisterSubscriber(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void addArticle(Article article) {
		articles.add(article);
		for(Subscriber sub: this.getSubscribers()) {
			sub.update(article);
		}
	}
	
	
	
}
