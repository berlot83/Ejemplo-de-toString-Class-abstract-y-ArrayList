package modelo;

public class Fiat extends Automovil{
	
	protected String belleza;
	
	public Fiat(int rendimiento, int capacidad, int velocidad, String belleza)
	{
		super(rendimiento,capacidad,velocidad);
		this.belleza= belleza;
	}

	public String getBelleza() {
		return belleza;
	}

	public void setBelleza(String belleza) {
		this.belleza = belleza;
	}
	
	@Override
	public String toString()
	{
		
		System.out.println("el rendimiento del Fiat es: "); return getRendimiento()+" en kilometros recorridos, y una capacidad de carga de "+getCapacidad()+" personas, además son "+getBelleza()+"\n";
	}
	

}
