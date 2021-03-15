package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("KeyInfo")
public class KeyInfo {

	public X509Data X509Data;

	public X509Data getX509Data() {
		return X509Data;
	}

	public void setX509Data(X509Data x509Data) {
		X509Data = x509Data;
	}

}
