package stepDefinition;

import config.Config;
import pageObjects.ConsumoCsPage;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import work.assisjrs.seleniumtestcase.SeleniumTestCase;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

/**
 * Created by Diego Malafaia on 21/03/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = DEFINED_PORT)
@ContextConfiguration(classes = Config.class)
@DatabaseSetup("datasets/CsConsumoStep.xml")
@Transactional
@SeleniumTestCase(url = "http://localhost:9999/",
        pageObject = ConsumoCsPage.class)
public class CsConsumoStep {
    @Autowired
    private ConsumoCsPage transacaoPage;

    @Dado("^que esteja na pagina principal$")
    public void queEuEstejaNaPaginaPrincipalDoSistema() {

    }

    @Quando("^eu acesso a pagina de listagem de usuario$")
    public void euAcessoAPaginaDeUsuario(){
        transacaoPage.home();
    }


    @Então("^verifico que o \"([^\"]*)\" está sendo exibido na (\\d+) correta$")
    public void verificoQueOEstáSendoExibidoNaCorreta(String nome, int posicao) throws Throwable {
                transacaoPage.assertThat().UserIs(posicao, nome);
    }
}