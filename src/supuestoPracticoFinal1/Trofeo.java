package supuestoPracticoFinal1;

public class Trofeo {
	
	//Declaramos los atributos de la clase
	private String nombreTrofeo;
	private String descripcionTrofeo;
	private Boolean trofeoOficial;
	
	//Declaramos el contructor sin parámetros
	public Trofeo(){
		
		this.nombreTrofeo = "";
		this.descripcionTrofeo = "";
		this.trofeoOficial = false;
		
	}
	
	//Declaramos el constructor con parámetros
	public Trofeo(String nombreTrofeo, String descripcionTrofeo, Boolean trofeoOficial){
		
		this.nombreTrofeo = nombreTrofeo;
		this.descripcionTrofeo = descripcionTrofeo;
		this.trofeoOficial = trofeoOficial;
		
	}

	public String getNombreTrofeo() {
		return nombreTrofeo;
	}

	public void setNombreTrofeo(String nombreTrofeo) {
		this.nombreTrofeo = nombreTrofeo;
	}

	public String getDescripcionTrofeo() {
		return descripcionTrofeo;
	}

	public void setDescripcionTrofeo(String descripcionTrofeo) {
		this.descripcionTrofeo = descripcionTrofeo;
	}

	public Boolean getTrofeoOficial() {
		return trofeoOficial;
	}

	public void setTrofeoOficial(Boolean trofeoOficial) {
		this.trofeoOficial = trofeoOficial;
	}
	
	public int numeroDeTrofeosOficiales() {
		//Este método devolverá el número total de trofeos oficiales del atleta y lo enumerará por consola uno a uno.
		//Pendiente formatear la enumearción de los trofeos. 
		int numTrofeos = 0;
		
		return numTrofeos;
	}
	
	public boolean tieneMaratonSevilla() {
		//Este método devolverá true en caso de que el atleta tenga un trofeo que se llame "Maratón Sevilla".
		boolean maratonSevilla = false;
		return maratonSevilla;
	}
	
}
