package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("det")
public class Det {

	public Prod prod;
	public Imposto imposto;
	public String infAdProd;
	public String nItem;
	public String text;

	public Prod getProd() {
		return prod;
	}

	public void setProd(Prod prod) {
		this.prod = prod;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public String getInfAdProd() {
		return infAdProd;
	}

	public void setInfAdProd(String infAdProd) {
		this.infAdProd = infAdProd;
	}

	public String getnItem() {
		return nItem;
	}

	public void setnItem(String nItem) {
		this.nItem = nItem;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
