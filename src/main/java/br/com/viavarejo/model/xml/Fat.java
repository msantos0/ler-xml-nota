package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("fat")
public class Fat {

	public String nFat;
	public String vOrig;
	public String vDesc;
	public String vLiq;

	public String getnFat() {
		return nFat;
	}

	public void setnFat(String nFat) {
		this.nFat = nFat;
	}

	public String getvOrig() {
		return vOrig;
	}

	public void setvOrig(String vOrig) {
		this.vOrig = vOrig;
	}

	public String getvDesc() {
		return vDesc;
	}

	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}

	public String getvLiq() {
		return vLiq;
	}

	public void setvLiq(String vLiq) {
		this.vLiq = vLiq;
	}

}
