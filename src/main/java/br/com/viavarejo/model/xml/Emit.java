package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("emit")
public class Emit {

	public String CNPJ;
	public String xNome;
	public String xFant;
	public EnderEmit enderEmit;
	public String IE;
	public String CRT;
	public String Cep;


	public String getCep() {
		return Cep;
	}

	public void setCep(String cep) {
		Cep = cep;
	}

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

	public String getxFant() {
		return xFant;
	}

	public void setxFant(String xFant) {
		this.xFant = xFant;
	}

	public EnderEmit getEnderEmit() {
		return enderEmit;
	}

	public void setEnderEmit(EnderEmit enderEmit) {
		this.enderEmit = enderEmit;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getCRT() {
		return CRT;
	}

	public void setCRT(String cRT) {
		CRT = cRT;
	}

	@Override
	public String toString() {
		return "Emit [CNPJ=" + CNPJ + ", xNome=" + xNome + ", xFant=" + xFant + ", enderEmit=" + enderEmit + ", IE="
				+ IE + ", CRT=" + CRT + "]";
	}

}
