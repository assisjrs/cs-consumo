package pageObjects;

import org.assertj.core.api.AbstractAssert;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by assis on 17/03/17.
 */

public class ConsumoCsPageAssert extends AbstractAssert<ConsumoCsPageAssert, ConsumoCsPage> {
    public ConsumoCsPageAssert(ConsumoCsPage consumoCsPage) {
        super(consumoCsPage, ConsumoCsPageAssert.class);
    }

    public void tituloIs(String titulo) {
        assertThat(actual.titulo.getText()).isEqualTo(titulo);
    }

    public void UserIs(Integer posicao, String usuario) throws Exception {
        Thread.sleep(1000);
        WebElement tr = actual.listaDeUsuarios.get(posicao);
        String text = tr.getText();
        assertThat(text).contains(usuario);
    }


}
