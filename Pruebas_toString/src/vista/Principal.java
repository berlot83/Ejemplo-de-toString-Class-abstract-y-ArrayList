package vista;

import java.awt.List;
import java.util.ArrayList;

import modelo.Automovil;
import modelo.Fiat;
import modelo.Ford;
import modelo.Peugeot;
import modelo.Renault;

public class Principal {

	public static void main(String[] args) {
		
		Ford  auto= new Ford(300,4,160,"muy potentes");
		auto.getRendimiento();
		
		Renault auto1= new Renault(250,4,150,"muy duros");
		auto1.getVelocidad();
		
		Peugeot auto2= new Peugeot(250,4,170,"muy confortables");
		auto2.getConfort();
		
		Fiat auto3= new Fiat(200,4,180,"muy bellos");
		auto3.getBelleza();
		
		
		System.out.println("Los Fiat son coches con un nivel de "+auto3.getBelleza()+" importante, en cambio los Ford son más "+auto.getPotentes()+", los Renault, se caracterizan por su "+auto1.getDureza()+" y los Peugeot por su "+auto2.getConfort()+" la velocidad máxima de un Ford es de "+auto.getVelocidad()+" km/h\n\n");
		
		System.out.println("Capacidades de los vehículos:");
		if(auto.getVelocidad()<auto1.getVelocidad()){System.out.println("   • El Ford es más lento que el Renault");} else{System.out.println("   • El Ford es mucho más rapido que el Renault");
		if(auto2.getCapacidad()>auto3.getCapacidad()){System.out.println("   • El peugeot tiene más capacidad de carga de personas");} else if(auto2.getCapacidad()<auto3.getCapacidad()){System.out.println("   • El peugeot tiene la misma capacidad de carga o es menor\n");} else{System.out.println("   • Tienen igual capacidad de carga de personas.\n");}
		
		
		System.out.println(auto.toString());
		System.out.println(auto1.toString());
		System.out.println(auto2.toString());
		System.out.println(auto3.toString());
		
		Lista();
		
			}
		
	}
	
	
	public static void Lista(){
		ArrayList<Automovil> listadeautos= crearLista();
		for(Automovil coche: listadeautos){System.out.println(coche.toString());}; // Tener en cuenta que me está repitiendo el constructor con @Override
		
		masRapido(listadeautos);
		System.out.println("El coche más rápido es:     "+ masRapido(listadeautos));
		
	}
	
	
	public static ArrayList<Automovil> crearLista() {
		ArrayList<Automovil> listadeautos= new ArrayList<>();
		
			listadeautos.add(new Fiat(444,5,5000,"1"));
			listadeautos.add(new Ford(444,5,150,"2"));
			listadeautos.add(new Renault(8000,5,20,"3"));
			listadeautos.add(new Peugeot(100,5,150,"4"));
			
			return listadeautos;
	}
	
	public static Automovil masRapido(ArrayList<Automovil> listadodeautos){
		Automovil masRapido;
		masRapido= listadodeautos.get(0);
		for(Automovil coche: listadodeautos){
			if(coche.getVelocidad()<masRapido.getVelocidad()){masRapido= coche;}
		}
		
		return masRapido;
		
	}
	
	
		
		
}
	
	

	
	
	

	
	


