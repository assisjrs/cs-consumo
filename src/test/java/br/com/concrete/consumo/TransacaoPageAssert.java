package br.com.concrete.consumo;

import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by assis on 17/03/17.
 */
public class TransacaoPageAssert extends AbstractAssert<TransacaoPageAssert, TransacaoPage> {
    public TransacaoPageAssert(TransacaoPage transacaoPage) {
        super(transacaoPage, TransacaoPageAssert.class);
    }

    public void nameIs(String home) {
        actual.home();
        assertThat(actual.name.getText()).contains(home);
    }
}
