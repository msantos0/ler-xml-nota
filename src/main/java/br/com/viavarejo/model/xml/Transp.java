package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("transp")
public class Transp {

	public String modFrete;
	public Transporta transporta;
	public Vol vol;

	public String getModFrete() {
		return modFrete;
	}

	public void setModFrete(String modFrete) {
		this.modFrete = modFrete;
	}

	public Transporta getTransporta() {
		return transporta;
	}

	public void setTransporta(Transporta transporta) {
		this.transporta = transporta;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

}
