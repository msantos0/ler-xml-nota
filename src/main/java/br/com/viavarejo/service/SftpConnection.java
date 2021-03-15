package br.com.viavarejo.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

@Component
public class SftpConnection {

	@Autowired
	private NotaFiscalXmlService service;

	/**Busca xml's do fpt e transmite para o metodo lerXml() para converter a nota em objeto e gravar ela no MongoDB**/
	public void buscaNotasSftp() throws JSchException, SftpException, FileNotFoundException {

		/**Cria conexão com sftp**/
		JSch jsch = new JSch();
		Session session = null;
		Channel channel = null;
		ChannelSftp channelSftp = null;
		session = jsch.getSession("mallory", "10.128.34.14", 22);
		java.util.Properties config = new java.util.Properties();
		config.put("StrictHostKeyChecking", "no");
		config.put("PreferredAuthentications", "publickey,keyboard-interactive,password");
		session.setConfig(config);
		session.setPassword("ehH1%4^@g1hz");
		session.connect();

		/** Realiza a navegação dentro do sftp até a pasta  /transf/producao/XMLNOTAFISCAL **/
		channel = session.openChannel("sftp");
		channel.connect();
		channelSftp = (ChannelSftp) channel;
		channelSftp.cd("/transf/producao/XMLNOTAFISCAL");

		/** Recupera lista de arquivos xml dentro da pasta XMLNOTAFISCAL **/
		Vector<ChannelSftp.LsEntry> list = channelSftp.ls("*.*");

		/** Estrutura de repetição para que cada nota seja lida através do metodo lerXml,
			dentro da classe NotaFiscalXmlService**/
		for (ChannelSftp.LsEntry entry : list) {

			channelSftp.get(entry.getFilename(), entry.getFilename());

			FileReader reader = new FileReader(entry.getFilename());
			service.lerXml(reader,entry.getFilename());
		}

	}
}
