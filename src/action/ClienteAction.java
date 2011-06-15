package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;



import service.ClienteService;
import service.PaqueteBusinessDelegate;
import bean.ClienteDTO;

public class ClienteAction extends ActionSupport {

	/**
	 declaracion de variables
	 */
	private static final long serialVersionUID = -9132849019679591630L;
	private ClienteDTO cliente;
	private List<ClienteDTO> clientes;
	private String usuario;
	private ClienteService servicioCliente = PaqueteBusinessDelegate.getClienteService();

	/**
	 declaracion de getter/setter
	 */
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<ClienteDTO> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteDTO> clientes) {
		this.clientes = clientes;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	
	/**
	 declaracion metodo(registra)/service
	 */
	public String registra(){
		String vista="exito";
		try {
			servicioCliente.registraElCliente(cliente);
			clientes=servicioCliente.listaClientesPorNombre("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	/**
	 declaracion de metodo(cargamodifica)/servicio
	 */
	public String cargaModifica(){
		String vista="exito";
		try {
			cliente = servicioCliente.buscaClientePorUsuario(this.getUsuario());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	/**
	 declaracion de metodo(lista)/servicio
	 */
	public String lista(){
		String vista="exito";
		try {
			//clientes=servicioCliente.listaClientesPorNombre(cliente.getNombre());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	public String actualiza(){
		String vista="exito";
		try{
			cliente=servicioCliente.actualiza(cliente);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return vista;
	}
	
	
}
