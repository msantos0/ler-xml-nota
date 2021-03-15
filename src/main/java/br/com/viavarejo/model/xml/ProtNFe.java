package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("protNFe")
public class ProtNFe {

	public InfProt infProt;
	public String versao;
	public String text;

	public InfProt getInfProt() {
		return infProt;
	}

	public void setInfProt(InfProt infProt) {
		this.infProt = infProt;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
