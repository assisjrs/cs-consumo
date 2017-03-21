package stepDefinition;

import br.com.concrete.consumo.transacao.TransacaoPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.runner.RunWith;
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
@SeleniumTestCase(pageObject = TransacaoPage.class, url = "http://localhost:9090/#/home")
@SpringBootTest(webEnvironment = DEFINED_PORT)
public class CsConsumoStep {
    @Autowired
    private TransacaoPage page;

    @Dado("^que eu esteja na pagina principal do sistema$")
    public void queEuEstejaNaPaginaPrincipalDoSistema() {

    }

    @Quando("^eu acesso a pagina de usuario$")
    public void euAcessoAPaginaDeUsuario(){
    }

    @Então("^verifico que o nome do usuario esta correto$")
    public void verificoQueONomeDoUsuarioEstaCorreto(){

    }
}
