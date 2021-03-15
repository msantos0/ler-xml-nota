package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("vol")
public class Vol {

	public String qVol;
	public String esp;
	public String marca;
	public String pesoL;
	public String pesoB;

	public String getqVol() {
		return qVol;
	}

	public void setqVol(String qVol) {
		this.qVol = qVol;
	}

	public String getEsp() {
		return esp;
	}

	public void setEsp(String esp) {
		this.esp = esp;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPesoL() {
		return pesoL;
	}

	public void setPesoL(String pesoL) {
		this.pesoL = pesoL;
	}

	public String getPesoB() {
		return pesoB;
	}

	public void setPesoB(String pesoB) {
		this.pesoB = pesoB;
	}

}
