package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("IPI")
public class Ipi {

	public String cEnq;
	public IpiTrib IPITrib;

	public String getcEnq() {
		return cEnq;
	}

	public void setcEnq(String cEnq) {
		this.cEnq = cEnq;
	}

	public IpiTrib getIPITrib() {
		return IPITrib;
	}

	public void setIPITrib(IpiTrib iPITrib) {
		IPITrib = iPITrib;
	}

}
