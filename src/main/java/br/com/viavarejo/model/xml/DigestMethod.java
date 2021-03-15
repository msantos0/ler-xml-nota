package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("DigestMethod")
public class DigestMethod {

	public String Algorithm;

	public String getAlgorithm() {
		return Algorithm;
	}

	public void setAlgorithm(String algorithm) {
		Algorithm = algorithm;
	}

}
