package com.demo.sockit;

public class productos extends provedores {
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private String categoria;
	private double precio;
	private int idproductos;
	private static int total=0;
	public productos(int idDirecciones, String pais, String estado, String municipio, String cpostal, String calle,
			String numeroext, int idUsuarios, String usuario, String correo, String contraseña, int idProvedor, int tel,
			String ine, String rfc, String dirPago, String nombre, String descripcion, String uRL_imagen,
			String categoria, double precio, int idproductos) {
		super(idDirecciones, pais, estado, municipio, cpostal, calle, numeroext, idUsuarios, usuario, correo,
				contraseña, idProvedor, tel, ine, rfc, dirPago);
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.categoria = categoria;
		this.precio = precio;
		total ++;
		this.idproductos = total;
		
	}// constructorProductos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getURL_imagen() {
		return URL_imagen;
	}
	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getIdproductos() {
		return idproductos;
	}
	
	@Override
	public String toString() {
		return "productos [getNombre()=" + getNombre() + ", getDescripcion()=" + getDescripcion() + ", getURL_imagen()="
				+ getURL_imagen() + ", getCategoria()=" + getCategoria() + ", getPrecio()=" + getPrecio()
				+ ", getIdproductos()=" + getIdproductos() + "]";
	}//toStringProductos
	

	
}//classProductos


