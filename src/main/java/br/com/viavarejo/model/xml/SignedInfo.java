package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SignedInfo")
public class SignedInfo {

	public CanonicalizationMethod CanonicalizationMethod;
	public SignatureMethod SignatureMethod;
	public Reference Reference;

	public CanonicalizationMethod getCanonicalizationMethod() {
		return CanonicalizationMethod;
	}

	public void setCanonicalizationMethod(CanonicalizationMethod canonicalizationMethod) {
		CanonicalizationMethod = canonicalizationMethod;
	}

	public SignatureMethod getSignatureMethod() {
		return SignatureMethod;
	}

	public void setSignatureMethod(SignatureMethod signatureMethod) {
		SignatureMethod = signatureMethod;
	}

	public Reference getReference() {
		return Reference;
	}

	public void setReference(Reference reference) {
		Reference = reference;
	}

}
