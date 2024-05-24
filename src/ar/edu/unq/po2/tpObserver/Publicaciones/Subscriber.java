package ar.edu.unq.po2.tpObserver.Publicaciones;

abstract class Subscriber {
	
	Subscription subscription;
	
	public Subscriber(Subscription subscription) {
		this.subscription = subscription;
	}
	
	public abstract void update(Article article);

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
		

}
