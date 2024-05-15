package ar.edu.unq.po2.tpComposite.ej3;

public class Engineer extends Character{

	int ubicationX;
	int ubicationY;
	
	public Engineer(int ubicationX, int ubicationY) {
		this.ubicationX = ubicationX;
		this.ubicationY = ubicationY;
	}
	
	public void setUbicationX(int ubicationX) {
		this.ubicationX = ubicationX;
	}
	
	public void setUbicationY(int ubicationY) {
		this.ubicationY = ubicationY;
	}

	public int getUbicationX() {
		return ubicationX;
	}

	public int getUbicationY() {
		return ubicationY;
	}
	
	public void walkTo(int ubiactionX, int ubiactionY) {
		this.setUbicationX(ubiactionX);
		this.setUbicationY(ubiactionY);
		// Mientras camina deja lajas en el piso
	}
}
