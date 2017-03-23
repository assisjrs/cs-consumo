package stepDefinition;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import config.Config;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import pageObjects.ConsumoCsPage;
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
    private ConsumoCsPage page;

    @Dado("^que esteja na pagina principal$")
    public void queEuEstejaNaPaginaPrincipalDoSistema() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Quando("^eu acesso a pagina de listagem de usuario$")
    public void euAcessoAPaginaDeUsuario() {
        page.home();
    }

    @Então("^verifico que o \"([^\"]*)\" e o (\\d+) estão presentes$")
    public void verificoQueOEOEstãoPresentes(String nome, Double valor) throws Throwable {
        Thread.sleep(300);

        page.assertThat()
            .userFound(nome);

        page.assertThat()
            .valueFound(valor);
    }

    @Test
    public void test(){}
}