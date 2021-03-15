package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Signature")
public class Signature {

	public SignedInfo SignedInfo;
	public String SignatureValue;
	public KeyInfo KeyInfo;
	public String xmlns;
	public String text;

	public SignedInfo getSignedInfo() {
		return SignedInfo;
	}

	public void setSignedInfo(SignedInfo signedInfo) {
		SignedInfo = signedInfo;
	}

	public String getSignatureValue() {
		return SignatureValue;
	}

	public void setSignatureValue(String signatureValue) {
		SignatureValue = signatureValue;
	}

	public KeyInfo getKeyInfo() {
		return KeyInfo;
	}

	public void setKeyInfo(KeyInfo keyInfo) {
		KeyInfo = keyInfo;
	}

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
