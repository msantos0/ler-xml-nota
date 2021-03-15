package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("total")
public class Total {

	public IcmsTot ICMSTot;

	public IcmsTot getICMSTot() {
		return ICMSTot;
	}

	public void setICMSTot(IcmsTot iCMSTot) {
		ICMSTot = iCMSTot;
	}

}
