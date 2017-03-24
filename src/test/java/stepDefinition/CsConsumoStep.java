package stepDefinition;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import config.Config;
import config.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
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

    //@Autowired
    //private WebDriver driver;

    @Dado("^que esteja na pagina principal$")
    public void queEuEstejaNaPaginaPrincipalDoSistema() { }

    @Dado("^que o funcionario não possua debitos$")
    public void queOFuncionarioNãoPossuaDebitos(){ }

    @Quando("^eu acesso a pagina de listagem de usuario$")
    public void euAcessoAPaginaDeUsuario() {
        page.clicarEmMarco();
    }

    @Então("^verifico que o \"([^\"]*)\" e o (\\d+) estão presentes$")
    public void verificoQueOEOEstãoPresentes(String nome, Double valor) throws Throwable {
        Thread.sleep(300);

        page.assertThat()
            .userFound(nome);

        page.assertThat()
            .valueFound(valor);

        //Utils.captureScreenshot(driver, "Pagina home");
    }

    @Então("^eu verifico que este funcionario não está sendo exibido\\.$")
    public void euVerificoQueEsteFuncionarioNãoEstáSendoExibido() throws Exception{
        Thread.sleep(300);
        page.assertThat()
            .userNotFound("Francisco");

        //Utils.captureScreenshot(driver, "Pagina home");
    }

    @Test
    public void test(){}
}