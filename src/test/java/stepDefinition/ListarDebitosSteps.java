package stepDefinition;

import br.com.concrete.page.ListaDeDebitosPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import work.assisjrs.seleniumtestcase.SeleniumTestCase;

/**
 * Created by gustavooliveira on 20/03/17.
 */
@SeleniumTestCase(pageObject = ListaDeDebitosPage.class)
public class ListarDebitosSteps {

    @Autowired
    private ListaDeDebitosPage listaDeDebitosPage;

    @Given("^A lista contem (\\d+) usuario com o nome \"([^\"]*)\"$")
    public void aListaContemUsuarioComONome(int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^eu visualisar a lista$")
    public void euVisualisarALista() throws Throwable {
        // Write code hegrava ore that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Devo encontrar a lista com (\\d+)  pessoa com o nome \"([^\"]*)\" e o debito de (\\d+) reais$")
    public void devoEncontrarAListaComPessoaComONomeEODebitoDeReais(int arg1, String arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^A lista de um mes passado nao deve conter o usuario \"([^\"]*)\"$")
    public void aListaDeUmMesPassadoNaoDeveConterOUsuario(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Nao deve encontrar o usuario \"([^\"]*)\"$")
    public void naoDeveEncontrarOUsuario(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^A lista deve conter o usuario com debitos do mes e do mes passado$")
    public void aListaDeveConterOUsuarioComDebitosDoMesEDoMesPassado() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Deve encontrar a lista com (\\d+) pessoa com o nome \"([^\"]*)\" e o debito de (\\d+) reais$")
    public void deveEncontrarAListaComPessoaComONomeEODebitoDeReais(int quantidade, String nome, int valorDebito) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        listaDeDebitosPage.asserthat().verificarConteudoDaLinha(quantidade, nome, valorDebito);
        throw new PendingException();
    }
}
