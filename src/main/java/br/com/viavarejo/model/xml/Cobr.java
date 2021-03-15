package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("cobr")
public class Cobr {

	public Fat fat;
	public Dup dup;

	public Fat getFat() {
		return fat;
	}

	public void setFat(Fat fat) {
		this.fat = fat;
	}

	public Dup getDup() {
		return dup;
	}

	public void setDup(Dup dup) {
		this.dup = dup;
	}

}
