package br.com.viavarejo.scheduler;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

import br.com.viavarejo.service.SftpConnection;

@Component
public class ReadXmlScheduler {

	

	@Autowired 
	private SftpConnection ftp;
	

	@Scheduled(cron = "*/5 * * * * *")
	public void readXml() throws FileNotFoundException, JSchException, SftpException {
		
		ftp.buscaNotasSftp();
		
	}

}
