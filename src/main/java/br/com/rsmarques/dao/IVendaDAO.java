/**
 * 
 */
package br.com.rsmarques.dao;

import br.com.rsmarques.dao.generic.IGenericDAO;
import br.com.rsmarques.domain.Venda;
import br.com.rsmarques.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rafael.marques
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
