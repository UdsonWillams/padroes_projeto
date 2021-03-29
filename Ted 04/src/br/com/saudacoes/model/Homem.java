package br.com.saudacoes.model;

public class Homem extends Pessoa{

	public Homem(String nome, String sexo) {
		super(nome, sexo);
		System.out.println("Olá Senhor: " + this.nome);
	}
}
