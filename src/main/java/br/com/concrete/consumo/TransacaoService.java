package br.com.concrete.consumo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gustavooliveira on 21/03/17.
 */
@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository repo;

    public List<Transacao> findAll(){
        return repo.findAll();
    }

}
