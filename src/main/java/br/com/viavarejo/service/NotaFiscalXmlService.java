package br.com.viavarejo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.viavarejo.model.xml.Det;
import br.com.viavarejo.model.xml.InfNfe;
import br.com.viavarejo.model.xml.NfeProc;
import br.com.viavarejo.repository.NfeProcRepository;

@Component
public class NotaFiscalXmlService {
	
	@Autowired
	public NfeProcRepository rep;

	/**
	 * Lê o xml, converte em objeto e salva os dados da nota fiscal no MongoDB, após isso exclui arquivo da nota 
	 * da maquina local
	 * */
	public void lerXml(FileReader reader, String fileName) throws FileNotFoundException {
		File arquivoNotaLocal = new File(fileName);  // objeto criado para poder excluir o arquivo da nota local
		XStream xStream = new XStream(new DomDriver());
		xStream.processAnnotations(NfeProc.class); // configurção para que seja identificada as anotações de todas as classes detnro do pacote model
		xStream.addImplicitCollection(InfNfe.class,"det" ,Det.class); // configuração para indicar que o objeto "DET" no xml é uma lista
		NfeProc nfeProc = (NfeProc) xStream.fromXML(reader); // conversão do xml em objeto "NfeProc"
		rep.save(nfeProc); // Gravando objeto convertido no mongo
		System.out.println("CHAVE DA NOTA SALVA NO MONGO: " + nfeProc.getProtNFe().getInfProt().getChNFe());
		arquivoNotaLocal.delete(); //Excluindo arquivo da nota local
	}
}
