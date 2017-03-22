package pageObjects;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.assisjrs.seleniumtestcase.SeleniumTestCase;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = DEFINED_PORT, value = "server.port=9999")
@SeleniumTestCase(pageObject = ConsumoCsPage.class, url = "http://localhost:9999/")
public class ConsumoCsPageTest {

    @Autowired
    public ConsumoCsPage page;

    @Test
	public void clicarNoLinkHome() {
        page.home();
        page.assertThat()
            .tituloIs("Lista de Usuarios");
	}
}
