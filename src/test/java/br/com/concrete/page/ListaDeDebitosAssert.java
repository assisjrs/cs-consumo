package br.com.concrete.page;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by gustavooliveira on 20/03/17.
 */
public class ListaDeDebitosAssert extends AbstractAssert<ListaDeDebitosAssert, ListaDeDebitosPage> {
    public ListaDeDebitosAssert(ListaDeDebitosPage listaDeDebitosPage) {
        super(listaDeDebitosPage, ListaDeDebitosAssert.class);
    }

    public void verificarConteudoDaLinha(int quantidade, String nome, int valorDebito) {
        assertThat(actual.getUsuarios().size()).isEqualTo(quantidade);
        assertThat(actual.getUsuarios().get(0)).isEqualTo(nome);
        assertThat(actual.getUsuarios().get(0)).isEqualTo(valorDebito);
    }
}
