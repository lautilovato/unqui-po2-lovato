package ar.edu.unq.po2.tpComposite.ej5;

import java.util.*;

public class ShoppingCart {
	
	List<Product> elements;
	
	public ShoppingCart() {
		
	}

	public List<Product> getElements() {
		return elements;
	}

	private void setElements(List<Product> elements) {
		this.elements = elements;
	}
	
	public int totalRounded() {
		return 0;
	}
	
	public float total() {
		return 0;
	}
}
