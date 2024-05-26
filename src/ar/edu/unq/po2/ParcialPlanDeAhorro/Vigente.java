package ar.edu.unq.po2.ParcialPlanDeAhorro;

public class Vigente implements EstadoPlanDeAhorro{

	public Vigente() {
		
	}
	
	public void pagarCuota(PlanDeAhorro planDeAhorro) {
		
		planDeAhorro.setCuotasPagas(planDeAhorro.getCuotasPagas() + 1);
		if(planDeAhorro.getCuotasPagas() == planDeAhorro.getCuotas()) {
			planDeAhorro.setEstadoDelPlan(new Finalizado());
		}
	}
	
	public void setearRetribucion(PlanDeAhorro planDeAhorro, Retribucion retribucion) {
		// ya no se puede seear la retribucion

	}
	
	public void  ejecutarRetribucion(PlanDeAhorro planDeAhorro) {
		
	}
}
