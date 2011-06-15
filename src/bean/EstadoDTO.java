package bean;

import java.io.Serializable;

public class EstadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cod_estado;
	public  String desc_estado;
	
	
	public int getCod_estado() {
		return cod_estado;
	}
	public void setCod_estado(int cod_estado) {
		this.cod_estado = cod_estado;
	}
	public String getDesc_estado() {
		return desc_estado;
	}
	public void setDesc_estado(String desc_estado) {
		this.desc_estado = desc_estado;
	}
	
	
}
