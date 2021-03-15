package br.com.viavarejo.model.xml;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("infNFe")
public class InfNfe {

	@XStreamAlias("ide")
	private Ide ide;

	@XStreamAlias("emit")
	private Emit emit;

	@XStreamAlias("dest")
	private Dest dest;

	@XStreamAlias("det")
	private List<Det> det;

	@XStreamAlias("total")
	private Total total;

	@XStreamAlias("transp")
	private Transp transp;

	@XStreamAlias("cobr")
	private Cobr cobr;

	@XStreamAlias("pag")
	private Pag pag;

	@XStreamAlias("infAdic")
	private InfAdic infAdic;

	@XStreamAlias("compra")
	private Compra compra;

	@XStreamAlias("infRespTec")
	private InfRespTec infRespTec;

	public Ide getIde() {
		return ide;
	}

	public void setIde(Ide ide) {
		this.ide = ide;
	}

	public Emit getEmit() {
		return emit;
	}

	public void setEmit(Emit emit) {
		this.emit = emit;
	}

	public Dest getDest() {
		return dest;
	}

	public void setDest(Dest dest) {
		this.dest = dest;
	}

	public List<Det> getDet() {
		return det;
	}

	public void setDet(List<Det> det) {
		this.det = det;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}

	public Transp getTransp() {
		return transp;
	}

	public void setTransp(Transp transp) {
		this.transp = transp;
	}

	public Cobr getCobr() {
		return cobr;
	}

	public void setCobr(Cobr cobr) {
		this.cobr = cobr;
	}

	public Pag getPag() {
		return pag;
	}

	public void setPag(Pag pag) {
		this.pag = pag;
	}

	public InfAdic getInfAdic() {
		return infAdic;
	}

	public void setInfAdic(InfAdic infAdic) {
		this.infAdic = infAdic;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public InfRespTec getInfRespTec() {
		return infRespTec;
	}

	public void setInfRespTec(InfRespTec infRespTec) {
		this.infRespTec = infRespTec;
	}

	@Override
	public String toString() {
		return "InfNfe [ide=" + ide + ", emit=" + emit + "]";
	}

}
