package br.com.viavarejo.model.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Reference")
public class Reference {

	public List<Transforms> Transforms;
	public DigestMethod DigestMethod;
	public String DigestValue;
	public String URI;
	public String text;

	

	public List<Transforms> getTransforms() {
		return Transforms;
	}

	public void setTransforms(List<Transforms> transforms) {
		Transforms = transforms;
	}

	public DigestMethod getDigestMethod() {
		return DigestMethod;
	}

	public void setDigestMethod(DigestMethod digestMethod) {
		DigestMethod = digestMethod;
	}

	public String getDigestValue() {
		return DigestValue;
	}

	public void setDigestValue(String digestValue) {
		DigestValue = digestValue;
	}

	public String getURI() {
		return URI;
	}

	public void setURI(String uRI) {
		URI = uRI;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
