package br.com.viavarejo.scheduler;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.jcraft.jsch.JSchException;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.viavarejo.model.xml.NfeProc;
import br.com.viavarejo.repository.NfeProcRepository;
import br.com.viavarejo.service.NotaFiscalXmlService;
import br.com.viavarejo.service.SftpConnection;

@Component
public class ReadXmlScheduler {

	@Autowired
	public NfeProcRepository rep;

	SftpConnection ftp = new SftpConnection();

	//@Scheduled(cron = "*/5 * * * * *")
	public void readXml() throws FileNotFoundException, JSchException {
		// ftp.conectaFtp();
		FileReader reader = new FileReader("C:\\000000714.XML");

		XStream xStream = new XStream(new DomDriver());
		xStream.processAnnotations(NfeProc.class);

		NfeProc nfeProc = (NfeProc) xStream.fromXML(reader);
		rep.save(nfeProc);
		System.out.println("NOTA SALVA NO MONGO: " + nfeProc.getNfe().getInfNfe().getIde().getcNF());

	}

	

}
