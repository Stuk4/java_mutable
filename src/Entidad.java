

import java.util.Date;

public class Entidad {

	 private Date date_no_mutante;
	 
	 private Date date_mutante;
	 
	 private String cadena;

	public Date getDate_no_mutante() {
		return new Date(date_no_mutante.getTime());
	}

	public void setDate_no_mutante(Date date_no_mutante) {
		this.date_no_mutante = new Date(date_no_mutante.getTime());
	}

	public Date getDate_mutante() {
		return date_mutante;
	}

	public void setDate_mutante(Date date_mutante) {
		this.date_mutante = date_mutante;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	
	 
	 
	
	
	
	
}
