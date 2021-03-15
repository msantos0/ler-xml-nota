package br.com.viavarejo.model.xml;

import org.springframework.data.mongodb.core.mapping.Document;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Document
@XStreamAlias("nfeProc")
public class NfeProc {

	@XStreamAlias("NFe")
	private Nfe nfe;

	@XStreamAlias("protNFe")
	private ProtNFe protNFe;

	public Nfe getNfe() {
		return nfe;
	}

	public void setNfe(Nfe nfe) {
		this.nfe = nfe;
	}

	public ProtNFe getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(ProtNFe protNFe) {
		this.protNFe = protNFe;
	}

	@Override
	public String toString() {
		return "NfeProc [nfe=" + nfe + "]";
	}
}
