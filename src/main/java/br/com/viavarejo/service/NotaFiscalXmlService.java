package br.com.viavarejo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

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
		File arquivoNotaLocal = new File(fileName); 
		XStream xStream = new XStream(new DomDriver());
		xStream.processAnnotations(NfeProc.class);

		NfeProc nfeProc = (NfeProc) xStream.fromXML(reader);
		rep.save(nfeProc);
		System.out.println("NOTA SALVA NO MONGO: " + nfeProc.getNfe().getInfNfe().getIde().getcNF());
		arquivoNotaLocal.delete();
	}
}
