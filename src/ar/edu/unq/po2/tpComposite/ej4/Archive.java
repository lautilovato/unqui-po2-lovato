package ar.edu.unq.po2.tpComposite.ej4;

import java.time.*;

public class Archive extends Node{

	LocalDateTime lastModificaiton;
	
	public Archive(String name, int size) {
		super(name);
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setName(String name) {
		this.name = name;
		this.lastModificaiton = LocalDateTime.now();
		
	}

	public LocalDateTime getLastModificaiton() {
		return lastModificaiton;
	}
	
}
