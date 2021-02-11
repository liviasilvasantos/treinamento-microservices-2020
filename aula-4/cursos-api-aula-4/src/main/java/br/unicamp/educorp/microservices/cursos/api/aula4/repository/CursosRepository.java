package br.unicamp.educorp.microservices.cursos.api.aula4.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.unicamp.educorp.microservices.cursos.api.aula4.model.Curso;

public interface CursosRepository extends JpaRepository<Curso, Integer> {

	List<Curso> findAllByCodigoContains(String codigo);

	List<Curso> findAllByCodigoContainsAndDescricaoContains(String codigo, String descricao);

	List<Curso> findAllByCodigoContains(String codigo, Pageable pageable);
}
