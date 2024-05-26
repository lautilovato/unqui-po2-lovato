package ar.edu.unq.po2.tpObserver.Deportes;

public class FilterMatch {
	
	private UserApp app;
	private Server server;


	public FilterMatch(UserApp app) {
		this.app = app;
		this.server = app.getServer();
	}

	public Server getServer() {
		return server;
	}

	public UserApp getApp() {
		return app;
	}
	
	public boolean isMatchInterest(Match match) {
		
		UserApp app = this.getApp();
		return app.getSportsOfInterest().contains(match.getSport()) || 
				app.getOpponentsOfInterest().stream().anyMatch(opponent -> match.getOpponents().contains(opponent));	
	}
		
	public void update() {
		Match lastMatchRegister = this.getServer().getLastMatchRegister();
		
		if(this.isMatchInterest(lastMatchRegister)){
			this.getApp().addMatchInterest(lastMatchRegister);
		}
	}
	
}

