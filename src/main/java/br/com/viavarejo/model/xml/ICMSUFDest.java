package br.com.viavarejo.model.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSUFDest")
public class ICMSUFDest {

	public String vBCUFDest;
	public String pICMSUFDest;
	public String pICMSInter;
	public String pICMSInterPart;
	public String vFCPUFDest;
	public String vICMSUFDest;
	public String vICMSUFRemet;

	public String getvBCUFDest() {
		return vBCUFDest;
	}

	public void setvBCUFDest(String vBCUFDest) {
		this.vBCUFDest = vBCUFDest;
	}

	public String getpICMSUFDest() {
		return pICMSUFDest;
	}

	public void setpICMSUFDest(String pICMSUFDest) {
		this.pICMSUFDest = pICMSUFDest;
	}

	public String getpICMSInter() {
		return pICMSInter;
	}

	public void setpICMSInter(String pICMSInter) {
		this.pICMSInter = pICMSInter;
	}

	public String getpICMSInterPart() {
		return pICMSInterPart;
	}

	public void setpICMSInterPart(String pICMSInterPart) {
		this.pICMSInterPart = pICMSInterPart;
	}

	public String getvFCPUFDest() {
		return vFCPUFDest;
	}

	public void setvFCPUFDest(String vFCPUFDest) {
		this.vFCPUFDest = vFCPUFDest;
	}

	public String getvICMSUFDest() {
		return vICMSUFDest;
	}

	public void setvICMSUFDest(String vICMSUFDest) {
		this.vICMSUFDest = vICMSUFDest;
	}

	public String getvICMSUFRemet() {
		return vICMSUFRemet;
	}

	public void setvICMSUFRemet(String vICMSUFRemet) {
		this.vICMSUFRemet = vICMSUFRemet;
	}

}
