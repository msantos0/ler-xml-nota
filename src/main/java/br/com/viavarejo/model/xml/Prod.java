package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("prod")
public class Prod {

	public String cProd;
	public String cEAN;
	public String xProd;
	public String NCM;
	public String CEST;
	public String CFOP;
	public String uCom;
	public String qCom;
	public String vUnCom;
	public String vProd;
	public String cEANTrib;
	public String uTrib;
	public String qTrib;
	public String vUnTrib;
	public String vFrete;
	public String vDesc;

	public String getvDesc() {
		return vDesc;
	}

	public void setvDesc(String vDesc) {
		this.vDesc = vDesc;
	}

	public String indTot;
	public String xPed;
	public String nItemPed;

	public String getcProd() {
		return cProd;
	}

	public void setcProd(String cProd) {
		this.cProd = cProd;
	}

	public String getcEAN() {
		return cEAN;
	}

	public void setcEAN(String cEAN) {
		this.cEAN = cEAN;
	}

	public String getxProd() {
		return xProd;
	}

	public void setxProd(String xProd) {
		this.xProd = xProd;
	}

	public String getNCM() {
		return NCM;
	}

	public void setNCM(String nCM) {
		NCM = nCM;
	}

	public String getCEST() {
		return CEST;
	}

	public void setCEST(String cEST) {
		CEST = cEST;
	}

	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String cFOP) {
		CFOP = cFOP;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public String getqCom() {
		return qCom;
	}

	public void setqCom(String qCom) {
		this.qCom = qCom;
	}

	public String getvUnCom() {
		return vUnCom;
	}

	public void setvUnCom(String vUnCom) {
		this.vUnCom = vUnCom;
	}

	public String getvProd() {
		return vProd;
	}

	public void setvProd(String vProd) {
		this.vProd = vProd;
	}

	public String getcEANTrib() {
		return cEANTrib;
	}

	public void setcEANTrib(String cEANTrib) {
		this.cEANTrib = cEANTrib;
	}

	public String getuTrib() {
		return uTrib;
	}

	public void setuTrib(String uTrib) {
		this.uTrib = uTrib;
	}

	public String getqTrib() {
		return qTrib;
	}

	public void setqTrib(String qTrib) {
		this.qTrib = qTrib;
	}

	public String getvUnTrib() {
		return vUnTrib;
	}

	public void setvUnTrib(String vUnTrib) {
		this.vUnTrib = vUnTrib;
	}

	public String getvFrete() {
		return vFrete;
	}

	public void setvFrete(String vFrete) {
		this.vFrete = vFrete;
	}

	public String getIndTot() {
		return indTot;
	}

	public void setIndTot(String indTot) {
		this.indTot = indTot;
	}

	public String getxPed() {
		return xPed;
	}

	public void setxPed(String xPed) {
		this.xPed = xPed;
	}

	public String getnItemPed() {
		return nItemPed;
	}

	public void setnItemPed(String nItemPed) {
		this.nItemPed = nItemPed;
	}

}
