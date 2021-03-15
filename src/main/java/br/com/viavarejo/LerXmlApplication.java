package br.com.viavarejo;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xml.sax.SAXException;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

@SpringBootApplication
public class LerXmlApplication {
	 	

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SpringApplication.run(LerXmlApplication.class, args);
		
		
		
		
		
	}

}
