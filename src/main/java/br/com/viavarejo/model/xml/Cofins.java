package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("COFINS")
public class Cofins {

	public CofinsAliq COFINSAliq;

	public CofinsAliq getCOFINSAliq() {
		return COFINSAliq;
	}

	public void setCOFINSAliq(CofinsAliq cOFINSAliq) {
		COFINSAliq = cOFINSAliq;
	}

}
