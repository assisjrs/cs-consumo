package br.com.concrete.consumo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gustavooliveira on 21/03/17.
 */
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
