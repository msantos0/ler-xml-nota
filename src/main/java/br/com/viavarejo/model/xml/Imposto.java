package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("imposto")
public class Imposto {

	public Icms ICMS;
	public Ipi IPI;
	public Pis PIS;
	public Cofins COFINS;
	public ICMSUFDest ICMSUFDest;

	public Icms getICMS() {
		return ICMS;
	}

	public void setICMS(Icms iCMS) {
		ICMS = iCMS;
	}

	public Ipi getIPI() {
		return IPI;
	}

	public void setIPI(Ipi iPI) {
		IPI = iPI;
	}

	public Pis getPIS() {
		return PIS;
	}

	public void setPIS(Pis pIS) {
		PIS = pIS;
	}

	public Cofins getCOFINS() {
		return COFINS;
	}

	public void setCOFINS(Cofins cOFINS) {
		COFINS = cOFINS;
	}

	public ICMSUFDest getICMSUFDest() {
		return ICMSUFDest;
	}

	public void setICMSUFDest(ICMSUFDest iCMSUFDest) {
		ICMSUFDest = iCMSUFDest;
	}

}
