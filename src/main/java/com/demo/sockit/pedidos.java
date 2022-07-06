package com.demo.sockit;

import java.time.format.DateTimeFormatter;

public class pedidos {
	private int idPedidos;
	private DateTimeFormatter fecha;
	private int idUsuarios;
	private int idproductos;
	private String nombre;
	private double precio;
	private static int total = 0;
	
	
	public pedidos(int idPedidos, DateTimeFormatter fecha, int idUsuarios, int idproductos, String nombre, double precio) {
		super();
		this.fecha = fecha;
		this.idUsuarios = idUsuarios;
		this.idproductos = idproductos;
		this.nombre = nombre;
		this.precio = precio;
		total ++;
		this.idPedidos = total;
	}// constructor
	
	
	public int getIdPedidos() {
		return idPedidos;
	}
	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}
	public DateTimeFormatter getFecha() {
		return fecha;
	}
	public void setFecha(DateTimeFormatter fecha) {
		this.fecha = fecha;
	}
	public int getIdUsuarios() {
		return idUsuarios;
	}
	public void setIdUsuarios(int idUsuarios) {
		this.idUsuarios = idUsuarios;
	}
	public int getIdproductos() {
		return idproductos;
	}
	public void setIdproductos(int idproductos) {
		this.idproductos = idproductos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "pedidos [getIdPedidos()=" + getIdPedidos() + ", getFecha()=" + getFecha() + ", getIdUsuarios()="
				+ getIdUsuarios() + ", getIdproductos()=" + getIdproductos() + ", getNombre()=" + getNombre()
				+ ", getPrecio()=" + getPrecio() + "]";
	}//toString
	
	
	
}//classpedidos
	
	
	
	
		

