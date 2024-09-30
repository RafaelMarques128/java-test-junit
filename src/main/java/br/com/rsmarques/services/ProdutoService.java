/**
 * 
 */
package br.com.rsmarques.services;

import br.com.rsmarques.dao.IProdutoDAO;
import br.com.rsmarques.domain.Produto;
import br.com.rsmarques.services.generic.GenericService;

/**
 * @author rafael.marques
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
