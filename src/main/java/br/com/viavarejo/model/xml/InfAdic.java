package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("infAdic")
public class InfAdic {

	public String infCpl;

	public String getInfCpl() {
		return infCpl;
	}

	public void setInfCpl(String infCpl) {
		this.infCpl = infCpl;
	}

}
