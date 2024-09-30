/**
 * 
 */
package rsmarques;

import br.com.rsmarques.dao.IProdutoDAO;
import br.com.rsmarques.domain.Produto;
import br.com.rsmarques.exceptions.TipoChaveNaoEncontradaException;
import br.com.rsmarques.services.IProdutoService;
import br.com.rsmarques.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rsmarques.dao.ProdutoDaoMock;

import java.math.BigDecimal;

/**
 * @author rafael.marques
 *
 */
public class ProdutoServiceTest {

	private IProdutoService produtoService;
	
	private Produto produto;
	
	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDaoMock();
		produtoService = new ProdutoService(dao);
	}
	
	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}
	
	@Test
	public void pesquisar() {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNotNull(produtor);
	}
	
	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluir() {
		produtoService.excluir(produto.getCodigo());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Rodrigo Pires");
		produtoService.alterar(produto);
		
		Assert.assertEquals("Rodrigo Pires", produto.getNome());
	}
}
