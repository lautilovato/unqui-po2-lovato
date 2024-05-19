package ar.edu.unq.po2.tpState;

public class MP3 {

	private Song songSelected;
	private StateMP3 state;
	
	public MP3() {
		this.state = new StateSongSelection();
	}

	public StateMP3 getState() {
		return state;
	}

	public void setState(StateMP3 state) {
		this.state = state;
	}

	public void setSonSelected(Song sonSelected) {
		this.songSelected = sonSelected;
	}

	public void play() {
		this.getState().play(this);
	}
	
	public void pause() {
		this.getState().pause(this);
	}
	
	public void stop() {
		this.getState().stop(this);
	}
	

}
