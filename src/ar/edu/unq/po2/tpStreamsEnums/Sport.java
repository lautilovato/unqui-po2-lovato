package ar.edu.unq.po2.tpStreamsEnums;

public enum Sport {
	
	RUNNING(1), SOCCER(2), BASKETBALL(2), TENNIS(3), JAVELIN(4);
	
	int complexity;
	
	Sport(int complexity){
		
		this.complexity = complexity;
	
	}

	public int getComplexity() {
		return complexity;
	}
	
}
