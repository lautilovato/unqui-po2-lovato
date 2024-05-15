package ar.edu.unq.po2.tpComposite.ej3;

public class Knight extends Character{

	int ubicationX;
	int ubicationY;
	
	
	public Knight(int setUbicationX, int setUbicationY) {
		this.ubicationX = setUbicationX;
		this.ubicationY = setUbicationY;
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
	
	public void walkTo(int ubicationX, int ubicationY) {
		this.setUbicationX(ubicationX);
		this.setUbicationY(ubicationY);
		// Camina en zig zag para vigilar la zona
	}
	
}
