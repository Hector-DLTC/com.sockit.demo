package com.demo.sockit;

public class usuarios {
	private int id;
	private String usuario;
	private String correo;
	private String contraseña;
	private String direccion;
	private static int total=0;
	
	public usuarios(int id, String usuario, String correo, String contraseña, String direccion) {
		super();
		this.usuario = usuario;
		this.correo = correo;
		this.contraseña = contraseña;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
		return "usuarios [usuario=" + usuario + ", correo=" + correo + ", contraseña=" + contraseña + ", direccion="
				+ direccion + "]";
	}//to string
}//class usuarios

