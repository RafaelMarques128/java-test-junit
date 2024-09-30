/**
 * 
 */
package br.com.rsmarques.dao;

import br.com.rsmarques.dao.generic.GenericDAO;
import br.com.rsmarques.domain.Venda;
import br.com.rsmarques.domain.Venda.Status;
import br.com.rsmarques.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rafael.marques
 *
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void atualiarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Status.CONCLUIDA);
		super.alterar(venda);
	}
	
	

}
