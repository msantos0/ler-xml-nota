package br.com.viavarejo.service;

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

	

	public void lerXml() throws FileNotFoundException {
	}
}
