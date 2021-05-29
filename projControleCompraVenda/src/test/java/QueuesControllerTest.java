

import br.com.Main;
import br.com.model.*;
import br.com.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
@WebAppConfiguration
public class QueuesControllerTest {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private CompraService compraService;
    @Autowired
    private FornecedorService fornecedorService;
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private VendaService vendaService;

    @Test
    public void save() throws Exception {

        long qtd = 50000;

        clienteService.deleteAll();
        compraService.deleteAll();
        fornecedorService.deleteAll();
        produtoService.deleteAll();
        vendaService.deleteAll();

        for ( int i = 1 ; i <= qtd ; i++){
            clienteService.sendClienteRabbit(new Cliente(i, "Nome Teste " + i, "123214314", "23124312421"));
        }

        for ( int i = 1 ; i <= qtd ; i++){
            fornecedorService.sendFornecedorRabbit(new Fornecedor(i, "Fornecedor " + i, "2222222222", "000000000000"));
        }

        for ( int i = 1 ; i <= qtd ; i++){
            produtoService.sendProdutoRabbit(new Produto(i, "Produto " + i));
        }

        for ( int i = 1 ; i <= qtd ; i++){
            compraService.sendCompraRabbit(new Compra(i, "Desc " + i, new Produto(i, "Produto " + i), new Fornecedor(i, "Fornecedor " + i, "2222222222", "000000000000")));
        }

        for ( int i = 1 ; i <= qtd ; i++){
            vendaService.sendVendaRabbit(new Venda(i, "Desc " + i, "21/05/2021", new Produto(i, "Produto " + i), new Cliente(i, "Nome Teste " + i, "123214314", "23124312421")));
        }

    }

}