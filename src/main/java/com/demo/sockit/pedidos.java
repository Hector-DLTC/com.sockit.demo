package com.demo.sockit;

import java.time.format.DateTimeFormatter;

public class pedidos {
	private int id;
	private DateTimeFormatter fecha;
	private int idUsuario;
	private int idProducto;
	private String nombreProducto;
	private double precioProducto;
	private static int total = 0;
	public pedidos(int id, DateTimeFormatter fecha, int idUsuario, int idProducto, String nombreProducto, double precioProducto) {
		super();
		this.fecha = fecha;
		this.idUsuario = idUsuario;
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		total++;
		this.id = total;
	}//constructor
	
	public pedidos() {
		total ++;
		this.id=total;
	}//pedidos

	public DateTimeFormatter getfecha() {
		return fecha;
	}

	public void setfecha(DateTimeFormatter fecha) {
		this.fecha = fecha;
	}

	public int getidUsuario() {
		return idUsuario;
	}

	public void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getidProducto() {
		return idProducto;
	}

	public void setidProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getnombreProducton() {
		return nombreProducto;
	}

	public void setnombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getprecioProducto() {
		return precioProducto;
	}
	
	public void setprecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "pedidos [fecha=" + fecha + ", idUsuario=" + idUsuario + ", idProducto=" + idProducto
				+ ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + "]";

	}//to string
}//class pedidos
