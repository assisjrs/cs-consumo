package br.com.concrete.consumo.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by assis on 20/03/17.
 */
@RestController
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @RequestMapping(value = "lista", method = RequestMethod.GET)
    public List<Transacao> lista(@Param("ano") int ano, @Param("mes") int mes)
    {

        return transacaoRepository.findAll();
    }
}
