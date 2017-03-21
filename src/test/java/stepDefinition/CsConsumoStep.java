package stepDefinition;

import br.com.concrete.consumo.transacao.TransacaoPage;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.assisjrs.seleniumtestcase.SeleniumTestCase;

import javax.annotation.security.RunAs;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

/**
 * Created by Diego Malafaia on 21/03/2017.
 */

@RunWith(SpringRunner.class)
@SeleniumTestCase(pageObject = TransacaoPage.class, url = "http://localhost:9999", webDriver = ChromeDriver.class)
@SpringBootTest(webEnvironment = DEFINED_PORT, value = "server.port=9999")
@DatabaseSetup("CsConsumoStep.xml")
public class CsConsumoStep {
    @Autowired
    private TransacaoPage page;

    @Dado("^que esteja na pagina principal$")
    public void queEuEstejaNaPaginaPrincipalDoSistema() {

    }

    @Quando("^eu acesso a pagina de listagem de usuario$")
    public void euAcessoAPaginaDeUsuario(){
        page.home();
    }

    @Então("^verifico que o \"([^\"]*)\" do usuario esta correto$")
    public void verificoQueODoUsuarioEstaCorreto(String nome) {
        page.assertThat().UserIs(0, nome);
    }


    @Então("^verifico que o nome do usuario esta correto$")
    public void verificoQueONomeDoUsuarioEstaCorreto(){

    }
}
