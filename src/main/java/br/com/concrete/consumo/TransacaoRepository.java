package br.com.concrete.consumo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by gustavooliveira on 21/03/17.
 */
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

    @Query("select t from Transacao where u.data BETWEEN :de AND :ate")
    List<Transacao> transacaoDoMes(@Param("de") LocalDate de, @Param("ate") LocalDate ate);
}
