package supuestoPracticoFinal1;

public class Trofeo {
	
	//Declaramos los atributos de la clase
	String nombreTrofeo;
	String descripcionTrofeo;
	Boolean trofeoOficial;
	
	//Declaramos el contructor sin parámetros
	Trofeo(){
		
		nombreTrofeo = "";
		descripcionTrofeo = "";
		trofeoOficial = false;
		
	}
	
	//Declaramos el constructor con parámetros
	Trofeo(String trofeo, String descripcion, Boolean oficial){
		
		nombreTrofeo = trofeo;
		descripcionTrofeo = descripcion;
		trofeoOficial = oficial;
		
	}

}
