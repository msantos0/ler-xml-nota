package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("dup")
public class Dup {

	public String nDup;
	public String dVenc;
	public String vDup;

	public String getnDup() {
		return nDup;
	}

	public void setnDup(String nDup) {
		this.nDup = nDup;
	}

	public String getdVenc() {
		return dVenc;
	}

	public void setdVenc(String dVenc) {
		this.dVenc = dVenc;
	}

	public String getvDup() {
		return vDup;
	}

	public void setvDup(String vDup) {
		this.vDup = vDup;
	}

}
