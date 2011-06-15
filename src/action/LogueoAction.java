package action;

import java.util.Map;

import service.LogueoService;
import service.PaqueteBusinessDelegate;
import bean.ClienteDTO;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogueoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensaje;
	private ClienteDTO cliente;
	
	public ClienteDTO getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String execute(){
		String vista="exito";
		// invocamos a nuestro servicio (logica de negocio)
		LogueoService logueoservice = PaqueteBusinessDelegate.getLogueoService();
		ClienteDTO usuarioCandidato = new ClienteDTO();
		usuarioCandidato.setCodigo(this.getCliente().getCodigo());
		
		ClienteDTO objUsuario=null;
		try {
			objUsuario = logueoservice.validaUsuario(usuarioCandidato);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(objUsuario!=null){
			if(objUsuario.getPassword().equals(this.getCliente().getPassword())){
			// creamos la sesion web con struts 2	
			Map<String, Object>	lasesion=	ActionContext.getContext().getSession();
			lasesion.put("b_usuario", objUsuario);
			}else{
				vista="error";
				this.setMensaje(this.getText("logueo.mensaje.error.clave"));
			}
		}else{
			vista="error";
			this.setMensaje(this.getText("logueo.mensaje.error.usuario"));
		}		
		return vista;
		
	}
	
}
