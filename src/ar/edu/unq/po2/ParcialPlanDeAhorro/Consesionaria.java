package ar.edu.unq.po2.ParcialPlanDeAhorro;

import java.util.ArrayList;
import java.util.List;


public class Consesionaria {

	private FabricaAutomotriz fabricaAutomotriz;
	private RedBancaria redBancaria;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public Consesionaria(FabricaAutomotriz fabricaAutomotriz, RedBancaria redBancaria, List<Cliente> clientes) {
		this.fabricaAutomotriz = fabricaAutomotriz;
		this.redBancaria = redBancaria;
		this.clientes = clientes;
	}

	public FabricaAutomotriz getFabricaAutomotriz() {
		return fabricaAutomotriz;
	}

	public void setFabricaAutomotriz(FabricaAutomotriz fabricaAutomotriz) {
		this.fabricaAutomotriz = fabricaAutomotriz;
	}

	public RedBancaria getRedBancaria() {
		return redBancaria;
	}

	public void setRedBancaria(RedBancaria redBancaria) {
		this.redBancaria = redBancaria;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public int getCuotasPendientesDeCobro() {
		int amount = 0;
		for(Cliente c:this.getClientes()) {
			if(c.getPlanDeAhorro().getCuotasPagas() > 0) {
				amount = amount + c.cuotasPendientes();
			}
		}
		return amount;
	}

	
}
