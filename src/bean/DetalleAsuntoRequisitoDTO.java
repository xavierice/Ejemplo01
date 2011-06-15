package bean;

import java.io.Serializable;

public class DetalleAsuntoRequisitoDTO   implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int codigo_tramite;
	private int cod_requisito;
	
	
	public int getCodigo_tramite() {
		return codigo_tramite;
	}
	public void setCodigo_tramite(int codigo_tramite) {
		this.codigo_tramite = codigo_tramite;
	}
	public int getCod_requisito() {
		return cod_requisito;
	}
	public void setCod_requisito(int cod_requisito) {
		this.cod_requisito = cod_requisito;
	}
	
	
}
