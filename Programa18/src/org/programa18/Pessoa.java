package org.programa18;

public class Pessoa {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
	}
	
	// ATRIBUTOS
	private String nome;
	private int maxLivros;
	// CONSTRUTOR
	public Pessoa() {
		nome = "Nome Desconhecido";
		maxLivros = 3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaxLivros() {
		return maxLivros;
	}

	public void setMaxLivros(int maxLivros) {
		this.maxLivros = maxLivros;
	}
	
	
	
	
    
	

}
