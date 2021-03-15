package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PIS")
public class Pis {

	public PisAliq PISAliq;

	public PisAliq getPISAliq() {
		return PISAliq;
	}

	public void setPISAliq(PisAliq pISAliq) {
		PISAliq = pISAliq;
	}

}
