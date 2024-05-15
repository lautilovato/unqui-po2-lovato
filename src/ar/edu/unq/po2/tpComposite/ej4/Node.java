package ar.edu.unq.po2.tpComposite.ej4;

abstract class Node {
	
	String name;
	int size;
	
	public Node(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract int getSize();
	
}
