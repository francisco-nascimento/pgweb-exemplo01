package br.ifpe.pg.exemplo01.contato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository 
	extends JpaRepository<Contato, Integer> {

}
