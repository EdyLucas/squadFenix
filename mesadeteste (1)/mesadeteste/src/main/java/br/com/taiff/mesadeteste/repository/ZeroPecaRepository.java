package br.com.taiff.mesadeteste.repository;

import br.com.taiff.mesadeteste.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.taiff.mesadeteste.model.ZeroPeca;

import java.util.Optional;

@Repository
public interface ZeroPecaRepository extends JpaRepository<ZeroPeca, Long> {

  boolean existsByProduto(Produto produto);
}
