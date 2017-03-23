package br.com.concrete.consumo.transacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by gustavooliveira on 21/03/17.
 */
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
