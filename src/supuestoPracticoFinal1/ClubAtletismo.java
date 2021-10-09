package supuestoPracticoFinal1;

import java.util.ArrayList;

public class ClubAtletismo {

	private String nombreClub;
	private int anyoInaguracion;
	private ArrayList<Atleta> atletas = new ArrayList<>();

	ClubAtletismo(){
		
	}
	
	ClubAtletismo(String nombreClub, int anyoInaguracion){
		
		this.nombreClub = nombreClub;
		this.anyoInaguracion = anyoInaguracion;
	}
	
	public String getNombreClub() {
		return nombreClub;
	}
	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}
	public int getAnyoInaguracion() {
		return anyoInaguracion;
	}
	public void setAnyoInaguracion(int anyoInaguracion) {
		this.anyoInaguracion = anyoInaguracion;
	}
	
	public ArrayList<Atleta> getAtletas() {
		return atletas;
	}

	public void setAtletas(ArrayList<Atleta> atletas) {
		this.atletas = atletas;
	}

	public int ComprobarNumeroTrofeosOficiales() {
		
		//Este método debe devolver el número total de trofeos de los atletas del Club y si este número es mayor de 100
		//devolver por consola el mensaje "Club de gran prestigio.
		
		int totalTrofeos = 0;
		
		if (totalTrofeos > 100) {
			
			System.out.println("Club de gran prestigio");
		}
		
		return totalTrofeos;
	}
	
	
}
