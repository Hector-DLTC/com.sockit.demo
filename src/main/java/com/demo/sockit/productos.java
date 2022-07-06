package com.demo.sockit;

public class productos {
	private String nombre;
	private String descripcion;
	private String URL_imagen;
	private String categoria;
	private double precio;
	private int id;
	private static int total=0;
	public productos(String nombre, String descripcion, String uRL_imagen, String categoria, double precio, int id) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		URL_imagen = uRL_imagen;
		this.categoria = categoria;
		this.precio = precio;
		total ++;
		this.id=total;
	}// constructor
	
	public productos() {
		total++;
		this.id=total;
	}//Producto
	public int getId() {
		return id;
	}//getId
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	public String getDescripcion() {
		return descripcion;
	}//getDescripcion
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}//setDescripcion
	public String getURL_imagen() {
		return URL_imagen;
	}//getURL_imagen
	public void setURL_imagen(String uRL_imagen) {
		URL_imagen = uRL_imagen;
	}//setURL_imagen
	public String getCategoria() {
		return categoria;
	}//getCategoria
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}//setCategoria
	public double getPrecio() {
		return precio;
	}//getPrecio
	public void setPrecio(double precio) {
		this.precio = precio;
	}//setPrecio

	@Override
	public String toString() {
		return "productos [nombre=" + nombre + ", descripcion=" + descripcion + ", URL_imagen=" + URL_imagen
				+ ", categoria=" + categoria + ", precio=" + precio + "]";
	}//toString productos
	
}//class productos


