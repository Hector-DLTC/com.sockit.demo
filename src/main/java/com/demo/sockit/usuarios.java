package com.demo.sockit;

public class usuarios extends direcciones {
	private int idUsuarios;
	private String usuario;
	private String correo;
	private String contraseña;
	private static int total=0;
	
	public usuarios(int idDirecciones, String pais, String estado, String municipio, String cpostal, String calle,
			String numeroext, int idUsuarios, String usuario, String correo, String contraseña) {
		super(idDirecciones, pais, estado, municipio, cpostal, calle, numeroext);
		this.usuario = usuario;
		this.correo = correo;
		this.contraseña = contraseña;
		total++;
		this.idUsuarios = total;
	}// constructor

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

	public int getIdUsuarios() {
		return idUsuarios;
	}

	
	@Override
	public String toString() {
		return "usuarios [getUsuario()=" + getUsuario() + ", getCorreo()=" + getCorreo() + ", getContraseña()="
				+ getContraseña() + ", getIdUsuarios()=" + getIdUsuarios() + "]";
	}//toString
	
}//class usuarios

