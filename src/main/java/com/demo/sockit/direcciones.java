package com.demo.sockit;

public class direcciones {
	
	private int idDirecciones;
	private String  pais;
	private String  estado;
	private String  municipio;
	private String  cpostal;
	private String  calle;
	private String  numeroext;
	
	private static int total=0;

	
	public direcciones(int idDirecciones, String pais, String estado, String municipio, String cpostal, String calle,
			String numeroext) {
		super();
		
		this.pais = pais;
		this.estado = estado;
		this.municipio = municipio;
		this.cpostal = cpostal;
		this.calle = calle;
		this.numeroext = numeroext;
		
		total ++;
		this.idDirecciones = total;
	}




	public String getPais() {
		return pais;
	}




	public void setPais(String pais) {
		this.pais = pais;
	}




	public String getEstado() {
		return estado;
	}




	public void setEstado(String estado) {
		this.estado = estado;
	}




	public String getMunicipio() {
		return municipio;
	}




	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}




	public String getCpostal() {
		return cpostal;
	}




	public void setCpostal(String cpostal) {
		this.cpostal = cpostal;
	}




	public String getCalle() {
		return calle;
	}




	public void setCalle(String calle) {
		this.calle = calle;
	}




	public String getNumeroext() {
		return numeroext;
	}




	public void setNumeroext(String numeroext) {
		this.numeroext = numeroext;
	}




	public int getIdDirecciones() {
		return idDirecciones;
	}




	@Override
	public String toString() {
		return "direcciones [getPais()=" + getPais() + ", getEstado()=" + getEstado() + ", getMunicipio()="
				+ getMunicipio() + ", getCpostal()=" + getCpostal() + ", getCalle()=" + getCalle() + ", getNumeroext()="
				+ getNumeroext() + ", getIdDirecciones()=" + getIdDirecciones() + "]";
	}




	
	
}
