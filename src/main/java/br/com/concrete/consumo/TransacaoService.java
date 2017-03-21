package br.com.concrete.consumo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.List;

/**
 * Created by gustavooliveira on 21/03/17.
 */
@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repo;

    public List<Transacao> findAll(){
        LocalDate de = LocalDate.of(Year.now().getValue(), Month.of(YearMonth.now().getMonthValue()).getValue(), 1);
        LocalDate ate = LocalDate.of(Year.now().getValue(), Month.of(YearMonth.now().getMonthValue()).getValue(), 31);
        return repo.transacaoDoMes(de, ate);
    }

}
