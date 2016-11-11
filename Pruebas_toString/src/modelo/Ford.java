package modelo;

public class Ford extends Automovil {
	
	protected String potentes;
	
	public Ford(int rendimiento, int capacidad, int velocidad, String potentes)
	{
		super(rendimiento, capacidad, velocidad);
		this.potentes= potentes;
	}
	
	public String getPotentes(){
		return potentes;
	}
	
	public void setPotentes(String potentes){
		this.potentes=potentes;
	}
	
	@Override
	public String toString()
	{
		
		System.out.println("el rendimiento del Ford es: "); return getRendimiento()+" en kilometros recorridos, y una capacidad de carga de "+getCapacidad()+" personas, además son "+getPotentes()+"\n";
	}

}
