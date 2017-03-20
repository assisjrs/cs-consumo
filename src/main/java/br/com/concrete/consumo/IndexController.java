package br.com.concrete.consumo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by assis on 13/03/17.
 */
@Controller
public class IndexController {
//    @RequestMapping("/")
//    public String index(@RequestParam(defaultValue = "World", name = "name") String name, Model model) {
//        model.addAttribute("name", name);
//
//        return "index";
//    }

    @RequestMapping(value = "/")
    public String homePage(){
        return "index";
    }


    @RequestMapping(value = "consumo/lista", method = RequestMethod.GET)
    public ResponseEntity<List<Transacao>> consumidores()
    {

        List<Transacao> list = new ArrayList<>();
        for (int i = 0; i < 10;  i++){
            Transacao t = new Transacao();
            t.setData(new Date());
            t.setId(Long.valueOf(i));
            t.setUsuario("Usuario" + i);
            t.setValor(Long.valueOf(i*10));
            list.add(t);
        }
        return new ResponseEntity<List<Transacao>>(new ArrayList<Transacao>(list), HttpStatus.OK);
    }
}
