package com.senac.javacombancodados.model;

import java.util.List;



public interface ClienteDao {
	public void gravar(Cliente cli);

	public void excluir(Cliente cli);

	public Cliente consultar(Long id);

	public List<Cliente> listar();
}
