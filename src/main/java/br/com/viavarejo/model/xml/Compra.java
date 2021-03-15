package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("compra")
public class Compra {

	public String xNEmp;
	public String xPed;
	public String xCont;

	public String getxNEmp() {
		return xNEmp;
	}

	public void setxNEmp(String xNEmp) {
		this.xNEmp = xNEmp;
	}

	public String getxPed() {
		return xPed;
	}

	public void setxPed(String xPed) {
		this.xPed = xPed;
	}

	public String getxCont() {
		return xCont;
	}

	public void setxCont(String xCont) {
		this.xCont = xCont;
	}

}
