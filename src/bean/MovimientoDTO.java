package bean;

import java.util.Date;

public class MovimientoDTO {

	private int cod_movimiento;
	private int cod_documento;
	private int area_origen;
	private int area_destino;
	private String fecha_recepcion;
	private String fecha_salida;
	private String usuario_receptor;
	private String usuario_salida;
	private int cod_accion;
	public int getCod_movimiento() {
		return cod_movimiento;
	}
	public void setCod_movimiento(int cod_movimiento) {
		this.cod_movimiento = cod_movimiento;
	}
	public int getCod_documento() {
		return cod_documento;
	}
	public void setCod_documento(int cod_documento) {
		this.cod_documento = cod_documento;
	}
	public int getArea_origen() {
		return area_origen;
	}
	public void setArea_origen(int area_origen) {
		this.area_origen = area_origen;
	}
	public int getArea_destino() {
		return area_destino;
	}
	public void setArea_destino(int area_destino) {
		this.area_destino = area_destino;
	}
	public String getFecha_recepcion() {
		return fecha_recepcion;
	}
	public void setFecha_recepcion(String fecha_recepcion) {
		this.fecha_recepcion = fecha_recepcion;
	}
	public String getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	public String getUsuario_receptor() {
		return usuario_receptor;
	}
	public void setUsuario_receptor(String usuario_receptor) {
		this.usuario_receptor = usuario_receptor;
	}
	public String getUsuario_salida() {
		return usuario_salida;
	}
	public void setUsuario_salida(String usuario_salida) {
		this.usuario_salida = usuario_salida;
	}
	public int getCod_accion() {
		return cod_accion;
	}
	public void setCod_accion(int cod_accion) {
		this.cod_accion = cod_accion;
	}
	
	
}
