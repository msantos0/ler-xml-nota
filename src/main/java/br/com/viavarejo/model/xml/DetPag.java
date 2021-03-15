package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("detpag")
public class DetPag {

	public String tPag;
	public String vPag;

	public String gettPag() {
		return tPag;
	}

	public void settPag(String tPag) {
		this.tPag = tPag;
	}

	public String getvPag() {
		return vPag;
	}

	public void setvPag(String vPag) {
		this.vPag = vPag;
	}

}
