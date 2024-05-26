package ar.edu.unq.po2.ParcialPlanDeAhorro;

public interface EstadoPlanDeAhorro {

	public void pagarCuota(PlanDeAhorro planDeAhorro);
	public void setearRetribucion(PlanDeAhorro planDeAhorro, Retribucion retribucion);
	public void ejecutarRetribucion(PlanDeAhorro planDeAhorro);
}
