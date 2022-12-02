package com.senac.javacombancodados.apl;

import com.senac.javacombancodados.controller.JDBCClienteDao;
import com.senac.javacombancodados.model.Cliente;


public class aplicacao {

	public static void main(String[] args) {	

		Cliente c = new Cliente(1,"Cassio","xxxxxxxxxxxxx");
		JDBCClienteDao op = new JDBCClienteDao();
		
		op.gravar(c);
	}

}
