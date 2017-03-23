package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by assis on 16/03/17.
 */
public class ConsumoCsPage {

    private WebDriver driver;

    @FindBy(linkText = "Home")
    private WebElement home;

    @FindBy(id = "titulo")
    WebElement titulo;

    @FindBy(xpath="//*[@id=\"listaDeUsuarios\"]/tbody/tr[*]/td[1]")
    List<WebElement> listaDeNomes;

    @FindBy(xpath="//*[@id=\"listaDeUsuarios\"]/tbody/tr[*]/td[2]")
    List<WebElement> listaDeValores;

    public ConsumoCsPage(WebDriver driver){
        this.driver = driver;
    }

    public void home(){
        home.click();
    }

    public ConsumoCsPageAssert assertThat() {
        return new ConsumoCsPageAssert(this);
    }
}