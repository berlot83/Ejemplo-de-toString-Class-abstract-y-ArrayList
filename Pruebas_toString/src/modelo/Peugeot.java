package modelo;

public class Peugeot extends Automovil{
	
	protected String confort;
	
	public Peugeot(int rendimiento, int capacidad, int velocidad, String confort)
	{
		super(rendimiento,capacidad,velocidad);
		this.confort=confort;
	}

	public String getConfort() {
		return confort;
	}

	public void setConfort(String confort) {
		this.confort = confort;
	}
	
	
	@Override
	public String toString()
	{
		
		System.out.println("el rendimiento del Peugeot es: "); return getRendimiento()+" en kilometros recorridos, y una capacidad de carga de "+getCapacidad()+" personas, además son "+getConfort()+"\n\n\n\n\n";
	}

}
