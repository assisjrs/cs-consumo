package br.com.concrete.consumo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.assisjrs.seleniumtestcase.SeleniumTestCase;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = DEFINED_PORT, value = "server.port=8080")
@SeleniumTestCase(pageObject = TransacaoPage.class)
public class TransacaoPageTest {

    @Autowired
    public TransacaoPage page;

    @Test
	public void clicarNoLinkHome() {
        page.assertThat()
            .nameIs("home");
	}
}
