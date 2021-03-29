package br.com.saudacoes.view;

import br.com.saudacoes.model.FactoryPessoa;

public class Main {

	public static void main(String[] args) {
		
		FactoryPessoa fp = new FactoryPessoa();
		String nome1 = "Udson";
		String sexo1 = "H";
		fp.getPessoa(nome1, sexo1);
		String nome2 = "Elida";
		String sexo2 = "M";
		fp.getPessoa(nome2, sexo2);
		String nome3 = "Udson&Elida";
		String sexo3 = "NI";
		fp.getPessoa(nome3, sexo3);
	}
}
