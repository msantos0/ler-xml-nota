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
		String chaveNota = "";
		XStream xStream = new XStream(new DomDriver());
		xStream.processAnnotations(NfeProc.class); // configurção para que seja identificada as anotações de todas as classes detnro do pacote model
		xStream.addImplicitCollection(InfNfe.class,"det" ,Det.class); // configuração para indicar que o objeto "DET" no xml é uma lista
		NfeProc nfeProc = (NfeProc) xStream.fromXML(reader); // conversão do xml em objeto "NfeProc"
		chaveNota = nfeProc.getProtNFe().getInfProt().getChNFe(); // guarda valor da chave da nota em uma variavel String
		NfeProc nfeMongo = rep.findByProtNFeInfProtChNFe(chaveNota); // faz query no mongoDB para verificar se aquela nota ja foi gravada
		
		if(nfeMongo == null) {
			// Se a nfeMongo for igual a null ou seja, se a nota ainda não foi gravada no mongo 
			rep.save(nfeProc); // Gravando objeto convertido no mongo
			System.out.println("CHAVE DA NOTA SALVA NO MONGO: " + chaveNota);
		}else {
			// Se a nfeMongo for diferente de null, a nota já existe no mongo, portanto é desprezada
			System.out.println("NOTA DESPREZADA POIS JÁ EXISTE NO MONGO: " + chaveNota);
		}
		
		arquivoNotaLocal.delete(); //Excluindo arquivo da nota local
	}
}
