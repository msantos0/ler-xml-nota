package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PISAliq")
public class PisAliq {

	public String CST;
	public String vBC;
	public String pPIS;
	public String vPIS;

	public String getCST() {
		return CST;
	}

	public void setCST(String cST) {
		CST = cST;
	}

	public String getvBC() {
		return vBC;
	}

	public void setvBC(String vBC) {
		this.vBC = vBC;
	}

	public String getpPIS() {
		return pPIS;
	}

	public void setpPIS(String pPIS) {
		this.pPIS = pPIS;
	}

	public String getvPIS() {
		return vPIS;
	}

	public void setvPIS(String vPIS) {
		this.vPIS = vPIS;
	}

}
