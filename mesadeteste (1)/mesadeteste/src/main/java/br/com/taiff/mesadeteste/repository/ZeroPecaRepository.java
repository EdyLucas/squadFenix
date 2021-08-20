package br.com.taiff.mesadeteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.taiff.mesadeteste.model.ZeroPeca;

@Repository
public interface ZeroPecaRepository extends JpaRepository<ZeroPeca, Long> {

}
