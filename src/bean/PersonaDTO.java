package bean;

	import java.io.Serializable;

	public class PersonaDTO implements Serializable {

		private static final long serialVersionUID = 1L;

		private int cod_persona;
		private String nombre_persona;
	    private int cod_tip_persona;
	    private int cod_tip_documento;
	    private int nro_documento;
	    private String direccion;
	    private String representante_legal;
	    private String email;
	    private int telefono;
	    private String password;
	    
	    
		public int getCod_persona() {
			return cod_persona;
		}
		public void setCod_persona(int cod_persona) {
			this.cod_persona = cod_persona;
		}
	
		public String getNombre_persona() {
			return nombre_persona;
		}
		public void setNombre_persona(String nombre_persona) {
			this.nombre_persona = nombre_persona;
		}
		
		public int getCod_tip_persona() {
			return cod_tip_persona;
		}
		public void setCod_tip_persona(int cod_tip_persona) {
			this.cod_tip_persona = cod_tip_persona;
		}
		public int getCod_tip_documento() {
			return cod_tip_documento;
		}
		public void setCod_tip_documento(int cod_tip_documento) {
			this.cod_tip_documento = cod_tip_documento;
		}
		public int getNro_documento() {
			return nro_documento;
		}
		public void setNro_documento(int nro_documento) {
			this.nro_documento = nro_documento;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		public String getRepresentante_legal() {
			return representante_legal;
		}
		public void setRepresentante_legal(String representante_legal) {
			this.representante_legal = representante_legal;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	   	
	
}
