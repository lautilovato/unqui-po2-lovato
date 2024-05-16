package ar.edu.unq.po2.tpComposite.ej4;

import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Directory extends Node{

	LocalDateTime creationDate;
	private List<Node> content = new ArrayList<Node>();
	
	public Directory(String name) {
		super(name);
		this.creationDate = LocalDateTime.now();
	}
	
	public Directory(String name, List<Node> content) {
		super(name);
		this.content = content;
		this.creationDate = LocalDateTime.now();
	}
	
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public List<Node> getContent() {
		return content;
	}
	
	public int getSize() {
		int totalSize = 0;
		for(Node node: this.getContent()) {
			totalSize = totalSize + node.getSize();
		}
		return totalSize;
	}
	
}
