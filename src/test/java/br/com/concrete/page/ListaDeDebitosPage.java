package br.com.concrete.page;

import br.com.concrete.consumo.Transacao;

import java.util.List;
import java.util.zip.ZipFile;

/**
 * Created by gustavooliveira on 20/03/17.
 */
public class ListaDeDebitosPage {


    private List<Transacao> usuarios;

    public ListaDeDebitosAssert asserthat() {
        return new ListaDeDebitosAssert(this);
    }

    public List<Transacao> getUsuarios() {
        return usuarios;
    }
}
