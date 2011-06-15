package action;

import java.util.List;
import java.util.Map;

import service.DocumentoService;
import service.MovimientoService;
import service.PaqueteBusinessDelegate;
import bean.ClienteDTO;
import bean.DocumentoDTO;
import bean.EstadoDTO;
import bean.MovimientoDTO;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MovimientoAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MovimientoDTO movimiento;
	private DocumentoDTO documento;
	private DocumentoService servicioDocumento = PaqueteBusinessDelegate.getDocumentoService();
	private List<MovimientoDTO> movimientos;
	private String cod_movimiento;
	private MovimientoService servicioMovimiento = PaqueteBusinessDelegate.getMovimientoService();
	private String cod_estado;
	private EstadoDTO estado;
	
	public EstadoDTO getEstado() {
		return estado;
	}
	public void setEstado(EstadoDTO estado) {
		this.estado = estado;
	}
	public String getCod_estado() {
		return cod_estado;
	}
	public void setCod_estado(String cod_estado) {
		this.cod_estado = cod_estado;
	}
	public DocumentoDTO getDocumento() {
		return documento;
	}
	public void setDocumento(DocumentoDTO documento) {
		this.documento = documento;
	}
	public DocumentoService getServicioDocumento() {
		return servicioDocumento;
	}
	public void setServicioDocumento(DocumentoService servicioDocumento) {
		this.servicioDocumento = servicioDocumento;
	}
	private String cod_documento;
	
	public String getCod_documento() {
		return cod_documento;
	}
	public void setCod_documento(String cod_documento) {
		this.cod_documento = cod_documento;
	}
	public MovimientoDTO getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(MovimientoDTO movimiento) {
		this.movimiento = movimiento;
	}
	public List<MovimientoDTO> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<MovimientoDTO> movimientos) {
		this.movimientos = movimientos;
	}
	public String getCod_movimiento() {
		return cod_movimiento;
	}
	public void setCod_movimiento(String cod_movimiento) {
		this.cod_movimiento = cod_movimiento;
	}
	public MovimientoService getServicioMovimiento() {
		return servicioMovimiento;
	}
	public void setServicioMovimiento(MovimientoService servicioMovimiento) {
		this.servicioMovimiento = servicioMovimiento;
	}
	
	public String registra(){
		String vista="exito";
		
		if(movimiento!=null){
			System.out.println("movimiento existe ");
			System.out.println("esto es "+documento.getCod_documento());
		}else{
			System.out.println("no existe movimiento");
		}

		
		try{
			
Map<String, Object> session = ActionContext.getContext().getSession();
			
			ClienteDTO usuario = new ClienteDTO();
			usuario = (ClienteDTO)session.get("b_usuario") ;
			System.out.println("si hay sesion");
		//	System.out.println("usuario que se insertara "+usuario.getUsuario());
		
			//movimiento.setUsuario_salida(usuario.getUsuario());
			
			
		movimiento.setArea_origen(documento.getArea_actual());
			servicioMovimiento.registraMovimiento(movimiento,documento);
		
			documento.setArea_actual(movimiento.getArea_destino());

			System.out.println(documento.getArea_actual() + "area actual a modificar");
			servicioDocumento.actualizaDocumento(documento);
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		return vista;
		
	}
	public String lista(){
		String vista="exito";
		try {
			movimientos=servicioMovimiento.listaMovimientos();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	
	

}
