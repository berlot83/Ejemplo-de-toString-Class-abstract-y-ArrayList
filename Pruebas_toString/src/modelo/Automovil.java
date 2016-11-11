package modelo;

public abstract class Automovil {
	
	protected int rendimiento;
	protected int capacidad;
	protected int velocidad;
	
	public Automovil(int rendimiento, int capacidad, int velocidad)
	{
		this.rendimiento=rendimiento;
		this.capacidad=capacidad;
		this.velocidad=velocidad;
		
	}
	
	public int getRendimiento() {
		return rendimiento;
	}
	public void setRendimiento(int rendimiento) {
		this.rendimiento = rendimiento;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int getVelocidad(){
		return velocidad;
	}
	
	public void setVelocidad(int velocidad){
		this.velocidad= velocidad;
	}

}
