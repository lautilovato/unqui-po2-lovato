package ar.edu.unq.po2.ParcialPlanDeAhorro;

public class Finalizado implements EstadoPlanDeAhorro {

	public Finalizado() {
		
	}
	
	public void pagarCuota(PlanDeAhorro planDeAhorro) {
		
	}
	
	public void setearRetribucion(PlanDeAhorro planDeAhorro, Retribucion retribucion) {
		// ya no se puede seear la retribucion
	}
	
	public void  ejecutarRetribucion(PlanDeAhorro planDeAhorro) {
		planDeAhorro.getRetribucion().ejecutar();
		planDeAhorro.setEstadoDelPlan(new Cerrado());
	}
}
