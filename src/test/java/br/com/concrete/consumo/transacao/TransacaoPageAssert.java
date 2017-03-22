package br.com.concrete.consumo.transacao;

import org.assertj.core.api.AbstractAssert;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

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

    public void UserIs(Integer posicao, String usuario) {
        WebElement tr = actual.listaDeUsuarios.get(posicao);
        String text = tr.getText();
        assertThat(text).isEqualTo(usuario);
        //Assert.assertEquals(text, usuario);
    }


}
