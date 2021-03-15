package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("X509Data")
public class X509Data {

	public String X509Certificate;

	public String getX509Certificate() {
		return X509Certificate;
	}

	public void setX509Certificate(String x509Certificate) {
		X509Certificate = x509Certificate;
	}

}
