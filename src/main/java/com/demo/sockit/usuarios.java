package com.demo.sockit;

public class usuarios {
	private int id;
	private String usuario;
	private String correo;
	private String contrase�a;
	private String direccion;
	private static int total=0;
	
	public usuarios(int id, String usuario, String correo, String contrase�a, String direccion) {
		super();
		this.usuario = usuario;
		this.correo = correo;
		this.contrase�a = contrase�a;
		this.direccion = direccion;
		total++;
		this.id = total;
	}//constructor
	
	public usuarios() {
		total ++;
		this.id=total;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "usuarios [usuario=" + usuario + ", correo=" + correo + ", contrase�a=" + contrase�a + ", direccion="
				+ direccion + "]";
	}//to string
}//class usuarios

