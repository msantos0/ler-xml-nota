package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS")
public class Icms {
	public Icms00 ICMS00;

	public Icms00 getICMS00() {
		return ICMS00;
	}

	public void setICMS00(Icms00 iCMS00) {
		ICMS00 = iCMS00;
	}

}
