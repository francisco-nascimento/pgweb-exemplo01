package br.ifpe.pg.exemplo01.contato;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository repositorio;

	public <S extends Contato> S salvarContato(S entity) {
		return repositorio.save(entity);
	}

	public List<Contato> listarTodos() {
		return repositorio.findAll();
	}

	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public Contato buscarPorId(Integer id) {
		return repositorio.findById(id).orElse(null);
	}
	
	
}
