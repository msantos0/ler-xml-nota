package br.com.viavarejo.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.viavarejo.model.xml.NfeProc;


public interface NfeProcRepository extends MongoRepository<NfeProc, String>{

	NfeProc findByProtNFeInfProtChNFe(String chaveNota);

}
