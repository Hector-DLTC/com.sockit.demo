package com.demo.sockit;

public class provedores{
	private int idProvedor;
	private int tel;
	private String ine;
	private String rfc;
	private String dirPago;
	private static int total =0;
		
	public provedores(int idProvedor, int tel, String ine, String rfc, String dirPago) {
		super();
		this.tel = tel;
		this.ine = ine;
		this.rfc = rfc;
		this.dirPago = dirPago;
		total++;
		this.idProvedor = total;
	}//constructor
	
	public int getTel() {
		return tel;
	}//getTel
	public void setTel(int tel) {
		this.tel = tel;
	}//setTel
	public String getIne() {
		return ine;
	}//getIne
	public void setIne(String ine) {
		this.ine = ine;
	}//setIne
	public String getRfc() {
		return rfc;
	}//getRfc
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}//setRfc
	public String getDirPago() {
		return dirPago;
	}//getDirPago
	public void setDirPago(String dirPago) {
		this.dirPago = dirPago;
	}//setDirPago
	public int getIdProvedor() {
		return idProvedor;
	}//getIdProvedor
	@Override
	public String toString() {
		return "provedores [getTel()=" + getTel() + ", getIne()=" + getIne() + ", getRfc()=" + getRfc()
				+ ", getDirPago()=" + getDirPago() + ", getIdProvedor()=" + getIdProvedor() + "]";
	}//toString
}//class provedores
