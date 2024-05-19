package ar.edu.unq.po2.tpState;

public class StatePause implements StateMP3{

	public StatePause() {
		
	}
	
	public void play(MP3 mp3) {
		
		return  ; // debe retornar un error
	
	}
	
	public void pause(MP3 mp3) {
		mp3.setState(new StatePlaying());
	}
	
	public void stop(MP3 mp3) {
		// este metodo no debe hacer nada
	}
	
}
