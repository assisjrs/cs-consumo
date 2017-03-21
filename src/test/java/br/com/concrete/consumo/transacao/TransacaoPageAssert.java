package br.com.concrete.consumo.transacao;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by assis on 17/03/17.
 */
public class TransacaoPageAssert extends AbstractAssert<TransacaoPageAssert, TransacaoPage> {
    public TransacaoPageAssert(TransacaoPage transacaoPage) {
        super(transacaoPage, TransacaoPageAssert.class);
    }

    public void tituloIs(String titulo) {
        assertThat(actual.titulo.getText()).isEqualTo(titulo);
    }
}
