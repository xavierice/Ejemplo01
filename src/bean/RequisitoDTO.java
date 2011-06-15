package bean;

import java.io.Serializable;

public class RequisitoDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cod_requisito;
	private String desc_requisito;
	private String status;
	
	public int getCod_requisito() {
		return cod_requisito;
	}
	public void setCod_requisito(int cod_requisito) {
		this.cod_requisito = cod_requisito;
	}
	public String getDesc_requisito() {
		return desc_requisito;
	}
	public void setDesc_requisito(String desc_requisito) {
		this.desc_requisito = desc_requisito;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
