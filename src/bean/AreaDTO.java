package bean;

import java.io.Serializable;

public class AreaDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cod_area;
	public  String nombre_area;
	private String status;
	
	
	public int getCod_area() {
		return cod_area;
	}
	public void setCod_area(int cod_area) {
		this.cod_area = cod_area;
	}
	public String getNombre_area() {
		return nombre_area;
	}
	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
