package pageObjects;

import br.com.concrete.consumo.transacao.Transacao;
import br.com.concrete.consumo.transacao.TransacaoController;
import org.assertj.core.api.AbstractAssert;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.util.List;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


/**
 * Created by gustavooliveira on 23/03/17.
 */
public class ConsumoCsRestAssert extends AbstractAssert<ConsumoCsRestAssert, TransacaoController> {

    @InjectMocks
    private MockMvc mockMvc;

    public ConsumoCsRestAssert(TransacaoController transacaoController) {
        super(transacaoController, ConsumoCsRestAssert.class);
    }

    public ConsumoCsRestAssert assertThat() throws Exception{
        return this;
    }

    public void jsonOk() throws Exception {
        mockMvc.perform(get("consumo/lista"))
                .andExpect(status().isOk());
    }
}
