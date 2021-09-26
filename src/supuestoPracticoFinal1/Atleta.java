package supuestoPracticoFinal1;

public class Atleta {

	//Definimos las variables necesarias. 
	int numeroFederado;
	String nombreAtleta;
	double horasDeEntrenamiento;
	String[] trofeosGanados = new String[5];
		
	//Creamos un tipo de dato personalizado con enum, este tipo es para asignar el tipo de Atleta. 
	enum TipoAtleta {
		VELOCISTA, MEDIO_FONDO, FONDO, OTROS
	}
	
	//Definimos el método constructor sin parametros.
	Atleta(){
		numeroFederado = 0;
		nombreAtleta = "";
		horasDeEntrenamiento = 0.0;
	}
	
	//Definimos el método constructor con parámetros para tener las dos alternativas de creación del objeto.
	Atleta(int numFed, String nombre, double horas){
		numeroFederado = numFed;
		nombreAtleta = nombre;
		horasDeEntrenamiento = horas;
		
	}
		
}