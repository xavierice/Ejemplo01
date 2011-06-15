package action;


import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import service.AreaService;
import service.PaqueteBusinessDelegate;
import bean.AreaDTO;

public class AreaAction extends ActionSupport {
	
	/**
	 Declaracion de Variables
	 */
	private static final long serialVersionUID = -342011476351560376L;
	private AreaDTO area;
	private List<AreaDTO> areas;
	private String cod_area;
	private AreaService servicioArea = PaqueteBusinessDelegate.getAreaService();


	/**
	 Declaracion de getters/setters
	 */
	public AreaDTO getArea() {
		return area;
	}
	public String getCod_area() {
		return cod_area;
	}
	public void setCod_area(String cod_area) {
		this.cod_area = cod_area;
	}
	public void setArea(AreaDTO area) {
		this.area = area;
	}
	public List<AreaDTO> getAreas() {
		return areas;
	}
	public void setAreas(List<AreaDTO> areas) {
		this.areas = areas;
	}
	public AreaService getServicioArea() {
		return servicioArea;
	}
	public void setServicioArea(AreaService servicioArea) {
		this.servicioArea = servicioArea;
	}
	
	
	/**
	 Declaracion de metodos/servicios
	 */
	public String registra(){
		String vista="exito";
		try{
			
			servicioArea.registraArea(area);
			
		}catch (Exception e) {
			e.printStackTrace();
		
		}
		return vista;
		
	}
	
	public String lista(){
		String vista="exito";
		try {
			areas=servicioArea.listaAreasxNombre();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	public String cargaModifica(){
		String vista="exito";
		try {
			area = servicioArea.buscaArea(this.getCod_area());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}

    public String actualiza(){
    	String vista="exito";
    	try {
			
			
			servicioArea.actualizaArea(area);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return vista;
    }
	

	
}
