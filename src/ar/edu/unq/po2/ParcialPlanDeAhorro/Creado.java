package ar.edu.unq.po2.ParcialPlanDeAhorro;

public class Creado implements EstadoPlanDeAhorro{
	
	public Creado() {
		
	}
	
	public void pagarCuota(PlanDeAhorro planDeAhorro) {
		if (planDeAhorro.getRetribucion() != null) {
			planDeAhorro.setEstadoDelPlan(new Vigente());
			planDeAhorro.pagarCuota();
		
		}
	}
	
	public void setearRetribucion(PlanDeAhorro planDeAhorro, Retribucion retribucion) {
		
			planDeAhorro.setRetribucion(retribucion);
	}
	
	public void  ejecutarRetribucion(PlanDeAhorro planDeAhorro) {
		
	}
}
