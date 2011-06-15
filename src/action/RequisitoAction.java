package action;


import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import service.PaqueteBusinessDelegate;
import service.RequisitoService;
import bean.RequisitoDTO;



public class RequisitoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1817141808275174943L;
	
	private RequisitoDTO req;
	private List<RequisitoDTO> reqs;
	private String cod_requisito;
	private RequisitoService servicioRequisito = PaqueteBusinessDelegate.getRequisitoService();

	public String getCod_requisito() {
		return cod_requisito;
	}

	public void setCod_requisito(String cod_requisito) {
		this.cod_requisito = cod_requisito;
	}

	public RequisitoDTO getReq() {
		return req;
	}

	public void setReq(RequisitoDTO req) {
		this.req = req;
	}
	
	public List<RequisitoDTO> getReqs() {
		return reqs;
	}

	public void setReqs(List<RequisitoDTO> reqs) {
		this.reqs = reqs;
	}

	public RequisitoService getServicioRequisito() {
		return servicioRequisito;
	}

	public void setServicioRequisito(RequisitoService servicioRequisito) {
		this.servicioRequisito = servicioRequisito;
	}
	
	public String cargaModifica(){
		String vista="exito";
		try {
			req = servicioRequisito.buscaRequisito(this.getCod_requisito());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	public String registra(){
		String vista="exito";
		
		try{
			
			servicioRequisito.registraRequisito(req);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
		
	}
	
	public String lista(){
		String vista="exito";
		try {
			reqs=servicioRequisito.listaAreasxRequisito();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	
	
	  public String actualiza(){
	    	String vista="exito";
	    	try {
				
				
				servicioRequisito.actualizaRequisito(req);
			
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return vista;
	    }

}
