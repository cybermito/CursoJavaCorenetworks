package supuestoPracticoFinal1;
import java.util.ArrayList;

public class Atleta {

	//Definimos las variables necesarias. 
	private int numeroFederado;
	private String nombreAtleta;
	private double horasDeEntrenamiento;
	private ArrayList<Trofeo> trofeosGanados = new ArrayList<>(); 
			
	//Creamos un tipo de dato personalizado con enum, este tipo es para asignar el tipo de Atleta. 
	private enum TipoAtleta {
		VELOCISTA, MEDIO_FONDO, FONDO, OTROS
	}
	
	//Definimos el método constructor sin parámetros.
	public Atleta(){
		this.numeroFederado = 0;
		this.nombreAtleta = "";
		this.horasDeEntrenamiento = 0.0;
	}
	
	//Definimos el método constructor con parámetros para tener las dos alternativas de creación del objeto.
	public Atleta(int numeroFederado, String nombreAtleta, double horasDeEntrenamiento){
		this.numeroFederado = numeroFederado;
		this.nombreAtleta = nombreAtleta;
		this.horasDeEntrenamiento = horasDeEntrenamiento;
		
	}

	//Definimos los getters y los setter desde Source/Definir Getters y Setters, que lo genera automáticamente Eclipse. 
	
	public int getNumeroFederado() {
		return numeroFederado;
	}

	public void setNumeroFederado(int numeroFederado) {
		this.numeroFederado = numeroFederado;
	}

	public String getNombreAtleta() {
		return nombreAtleta;
	}

	public void setNombreAtleta(String nombreAtleta) {
		this.nombreAtleta = nombreAtleta;
	}

	public double getHorasDeEntrenamiento() {
		return horasDeEntrenamiento;
	}

	public void setHorasDeEntrenamiento(double horasDeEntrenamiento) {
		this.horasDeEntrenamiento = horasDeEntrenamiento;
	}
		
	public ArrayList<Trofeo> getTrofeosGanados() {
		return trofeosGanados;
	}

	public void setTrofeosGanados(ArrayList<Trofeo> trofeosGanados) {
		this.trofeosGanados = trofeosGanados;
	}

	//Declaracióon de los métodos del objeto Atleta.
	public void entrarEnVacaciones() {
		this.horasDeEntrenamiento = this.horasDeEntrenamiento - ((this.horasDeEntrenamiento * 40) / 100);
	}
	
	public void entrenamientoEspecial(double porcentajeAumento, boolean aumentarEntrenamiento ) {
		
		if (aumentarEntrenamiento) {
			
			this.horasDeEntrenamiento = this.horasDeEntrenamiento + ((this.horasDeEntrenamiento * porcentajeAumento) / 100);
			
		}else {
			
			this.horasDeEntrenamiento = this.horasDeEntrenamiento - ((this.horasDeEntrenamiento * porcentajeAumento) / 100);
			
		}
		
	}
	
	
}