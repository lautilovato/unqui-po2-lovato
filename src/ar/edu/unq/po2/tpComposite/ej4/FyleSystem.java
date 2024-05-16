package ar.edu.unq.po2.tpComposite.ej4;

import java.util.*;

public class FyleSystem {
	
	private List<Node> content = new ArrayList<Node>();	
	
	public FyleSystem() {
		
	}
	
	public FyleSystem(List<Node> content) {
		this.content = content;
	}
	
	public List<Node> getContent() {
		return content;
	}

	public int getTotalSize() {
		int totalSize = 0;
		for(Node node: this.getContent()) {
			totalSize = totalSize + node.getSize();
		}
		return totalSize;
	}
	
	
}
