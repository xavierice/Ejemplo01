package bean;
import java.io.Serializable;
public class PasoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int cod_paso;
	public  String desc_paso;
	private int tiempo;
	
	
	public int getCod_paso() {
		return cod_paso;
	}
	public void setCod_paso(int cod_paso) {
		this.cod_paso = cod_paso;
	}
	public String getDesc_paso() {
		return desc_paso;
	}
	public void setDesc_paso(String desc_paso) {
		this.desc_paso = desc_paso;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	
}
