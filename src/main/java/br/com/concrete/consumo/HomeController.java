package br.com.concrete.consumo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by assis on 20/03/17.
 */
@RestController
public class HomeController {

    @Autowired
    private TransacaoService transacaoservice;

    @RequestMapping(value = "consumo/lista", method = RequestMethod.GET)
    public List<Transacao> consumidores()
    {
        
        //final List<Transacao> list =

        /*for (int i = 0; i < 10;  i++){
            Transacao t = new Transacao();
            t.setData(new Date());
            t.setId(Long.valueOf(i));
            t.setUsuario("Usuario" + i);
            t.setValor(Long.valueOf(i*10));

            list.add(t);
        }*/

        return transacaoservice.findAll();
    }
}
