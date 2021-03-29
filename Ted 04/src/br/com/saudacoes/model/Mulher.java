package br.com.saudacoes.model;

public class Mulher extends Pessoa{

	public Mulher(String nome, String sexo) {
		super(nome, sexo);
		System.out.println("Olá Senhora: " + this.nome);
	}
}
