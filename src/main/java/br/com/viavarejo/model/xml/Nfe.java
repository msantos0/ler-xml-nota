package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("NFe")
public class Nfe {

	@XStreamAlias("infNFe")
	private InfNfe infNfe;

	@XStreamAlias("Signature")
	private Signature signature;

	public InfNfe getInfNfe() {
		return infNfe;
	}

	public void setInfNfe(InfNfe infNfe) {
		this.infNfe = infNfe;
	}

	public Signature getSignature() {
		return signature;
	}

	public void setSignature(Signature signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "Nfe [infNfe=" + infNfe + "]";
	}

}
