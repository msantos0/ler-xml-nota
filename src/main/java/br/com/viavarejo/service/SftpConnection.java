package br.com.viavarejo.service;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SftpConnection {
	

	public void conectaFtp() throws JSchException {

		JSch jsch = new JSch();
		Session session = null;
		session = jsch.getSession("mallory", "10.128.34.14", 22);
		java.util.Properties config = new java.util.Properties();
		config.put("StrictHostKeyChecking", "no");
		config.put("PreferredAuthentications", "publickey,keyboard-interactive,password");
		session.setConfig(config);
		session.setPassword("ehH1%4^@g1hz");
		session.connect();
		System.out.println("APLICAÇÃO CONECTADA COM SERVIDOR FTP");

	}
	
	public void getArquivosXml() {
		
	}
}
