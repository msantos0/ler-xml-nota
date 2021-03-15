
package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("IPITrib")
public class IpiTrib {

	public String CST;
	public String vBC;
	public String pIPI;
	public String vIPI;

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

	public String getpIPI() {
		return pIPI;
	}

	public void setpIPI(String pIPI) {
		this.pIPI = pIPI;
	}

	public String getvIPI() {
		return vIPI;
	}

	public void setvIPI(String vIPI) {
		this.vIPI = vIPI;
	}

}
