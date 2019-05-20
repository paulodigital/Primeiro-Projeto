package br.edu.faculdadedelta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.faculdadedelta.modelo.Pessoa;

@Repository
@Transactional
public interface PessoaRepository extends CrudRepository<Pessoa, Long>{

	@Query("select p from Pessoa p where p.nome like %?1%") //Monta uma query para fazer a pesquisa no banco de dados
	List<Pessoa> findPessoaByName(String nome);
	
}
