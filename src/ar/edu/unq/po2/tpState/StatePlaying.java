package ar.edu.unq.po2.tpState;


public class StatePlaying implements StateMP3{

	public StatePlaying() {
		
	}
	
	public void play(MP3 mp3) {
		
		System.out.println("Error"); // debe retornar un error
	
	}
	
	public void pause(MP3 mp3) {
		mp3.setState(new StatePause());
	}
	
	public void stop(MP3 mp3) {
		mp3.setState(new StateSongSelection() );
	}
	
}
