package ar.edu.unq.po2.tpComposite.ej3;

import java.util.ArrayList;
import java.util.List;


public class Army extends Character{
	
	private List<Character> members = new ArrayList<Character>();
	
	public Army() {
		
	}
	
	public Army(List<Character> members) {
		this.members = members;
	}
	
	public List<Character> getMembers() {
		return members;
	}

	public void walkTo(int ubiactionX, int ubiactionY) {
		for(Character member: this.getMembers()) {
			member.walkTo(ubiactionX, ubiactionY);
		}
	}
}
