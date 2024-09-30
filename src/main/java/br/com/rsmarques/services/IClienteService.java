/**
 * 
 */
package br.com.rsmarques.services;

import br.com.rsmarques.domain.Cliente;
import br.com.rsmarques.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rafael.marques
 *
 */
public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
