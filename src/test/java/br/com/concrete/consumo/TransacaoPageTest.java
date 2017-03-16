package br.com.concrete.consumo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.assisjrs.seleniumtestcase.SeleniumTestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
@SeleniumTestCase(pageObject = TransacaoPage.class)
public class TransacaoPageTest {

    @Autowired
    public TransacaoPage page;

	@Test
	public void deveCarregarOObjetoDoContexto() {
        Assert.assertNotNull(page);
	}
}
