package ar.edu.unq.po2.tpObserver.Publicaciones;

public class Investigator extends Subscriber{
	
	public Investigator(Subscription subscription) {
		super(subscription);
	}
	
	public void update(Article article) {
		if(this.interested(article)) {
			this.receiveNotice();
		}
	}
	
	public boolean interested(Article article) {
		
		boolean value = false;
		
		if( this.getSubscription().getTitles().contains(article.getTitle()) ||
			this.getSubscription().getAuthors().stream().anyMatch(author -> article.getAuthors().contains(author)) ||
			this.getSubscription().getAffiliations().stream().anyMatch(affiliation -> article.getAffiliations().contains(affiliation)) ||
			this.getSubscription().getTypes().contains(article.getType()) ||
			this.getSubscription().getPublicationPlaces().contains(article.getPublicationPlace()) ||
			this.getSubscription().getKeywords().stream().anyMatch(keyword -> article.getKeywords().contains(keyword))		
			) {
			value = true;
		}
		
		return value;
	}
	
	public String receiveNotice() {
		return "Ha llegado un libro de tu interes";
	}
}
