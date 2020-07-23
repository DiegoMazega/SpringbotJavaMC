package com.diegomazega.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diegomazega.cursomc.domain.Categoria;

@Repository // habilita um objeto desse tipo a realizar acesso a dados.
//Passar a tabela e o tipo do identificador unico.
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
