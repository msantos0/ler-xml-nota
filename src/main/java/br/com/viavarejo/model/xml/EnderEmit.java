package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("enderEmit")
public class EnderEmit {

	public String xLgr;
	public String nro;
	public String xBairro;
	public String cMun;
	public String xMun;
	public String UF;
	public String CEP;
	public String xPais;
	public String fone;

	public String getxLgr() {
		return xLgr;
	}

	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getxBairro() {
		return xBairro;
	}

	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}

	public String getcMun() {
		return cMun;
	}

	public void setcMun(String cMun) {
		this.cMun = cMun;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getxPais() {
		return xPais;
	}

	public void setxPais(String xPais) {
		this.xPais = xPais;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
