package bean;

import java.io.Serializable;
import java.util.Date;


public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
    private String codigo;
    private String nombres;
    private String apellidos;
    private String agente;
    private String status;
    private String password;
    private Date  fec_cre;
    private int tipo_usuario;
    private int id_grupo;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getAgente() {
		return agente;
	}
	public void setAgente(String agente) {
		this.agente = agente;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getFec_cre() {
		return fec_cre;
	}
	public void setFec_cre(Date fec_cre) {
		this.fec_cre = fec_cre;
	}
	public int getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	public int getId_grupo() {
		return id_grupo;
	}
	public void setId_grupo(int id_grupo) {
		this.id_grupo = id_grupo;
	}
    
	
    

	
	
	
}
