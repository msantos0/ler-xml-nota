package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("transporta")
public class Transporta {

	public String CNPJ;
	public String xNome;
	public String IE;
	public String xEnder;
	public String xMun;
	public String UF;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getxEnder() {
		return xEnder;
	}

	public void setxEnder(String xEnder) {
		this.xEnder = xEnder;
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

}
