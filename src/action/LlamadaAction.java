package action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import service.LlamadaService;
import service.PaqueteBusinessDelegate;
import bean.LlamadaDTO;

public class LlamadaAction {
	private List<LlamadaDTO> llamadas;
	private LlamadaDTO llamada;
	private String fecha1,fecha2;
	private String phonenumber;
	private LlamadaService servicioLlamada = PaqueteBusinessDelegate.getLlamadaService();
	
	
	
	public String getFecha1() {
		return fecha1;
	}
	public void setFecha1(String fecha1) {
		this.fecha1 = fecha1;
	}
	public String getFecha2() {
		return fecha2;
	}
	public void setFecha2(String fecha2) {
		this.fecha2 = fecha2;
	}
	public List<LlamadaDTO> getLlamadas() {
		return llamadas;
	}
	public void setLlamadas(List<LlamadaDTO> llamadas) {
		this.llamadas = llamadas;
	}
	public LlamadaDTO getLlamada() {
		return llamada;
	}
	public void setLlamada(LlamadaDTO llamada) {
		this.llamada = llamada;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public LlamadaService getServicioLlamada() {
		return servicioLlamada;
	}
	public void setServicioLlamada(LlamadaService servicioLlamada) {
		this.servicioLlamada = servicioLlamada;
	}

	
	
	
	public String lista(){
		String vista="exito";
		try {
			
			System.out.println("buscara de "+fecha1+" al "+fecha2);
			
	
			
		    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
		    
		    Date fechaini = null;
		    Date fechafin = null;
		    try {

		        fechaini = formatoDelTexto.parse(fecha1);
		        fechafin = formatoDelTexto.parse(fecha2);
		        
		        System.out.println(fechaini);
		        System.out.println(fechafin);

		    } catch (ParseException ex) {

		        ex.printStackTrace();

		    }

		    System.out.println("buscara desde :"+fechaini.toString());
		    System.out.println("hasta: "+fechafin.toString());
			
			
			if(fechaini.after(fechafin)){
				System.out.println("fechas incorrectas");
				
			}else{
				
		
			
			phonenumber = llamada.getPhonenumber();
			
			System.out.println("esta buscando llamadas con este numero: "+phonenumber);
				
				//llamadas = servicioLlamada.listaLlamadasxNum(phonenumber);
			llamadas = servicioLlamada.listaLlamadasxNumYFec(phonenumber,fechaini,fechafin);
				if(llamadas == null){
					System.out.println("no hay llamadas");
				
					
				}else{
					System.out.println("si hay llamadas");
					System.out.println("tamaño de la lista: "+llamadas.size());
				}
		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	
}
