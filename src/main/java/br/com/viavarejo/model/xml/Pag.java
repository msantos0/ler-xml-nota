package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("pag")
public class Pag {

	public DetPag detPag;

	public DetPag getDetPag() {
		return detPag;
	}

	public void setDetPag(DetPag detPag) {
		this.detPag = detPag;
	}

}
