package modelo;

public class Renault extends Automovil {
	
	protected String dureza;
	
	public Renault(int rendimiento, int capacidad, int velocidad, String dureza)
	{
		super(rendimiento,capacidad,velocidad);
		this.dureza=dureza;
	}

	public String getDureza() {
		return dureza;
	}

	public void setDureza(String dureza) {
		this.dureza = dureza;
	}
	
	@Override
	public String toString()
	{
		
		System.out.println("el rendimiento del Renault es: "); return getRendimiento()+" en kilometros recorridos, y una capacidad de carga de "+getCapacidad()+" personas, además son "+getDureza()+"\n";
	}

}
