package br.com.concrete.consumo.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.util.Date;
import java.util.List;

/**
 * Created by assis on 20/03/17.
 */
@RestController
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @RequestMapping(value = "consumo/lista", method = RequestMethod.GET)
    public List<Transacao> consumidores()
    {
        return transacaoRepository.findAll();
    }
}
