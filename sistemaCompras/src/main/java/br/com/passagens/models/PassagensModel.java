package br.com.passagens.models;

public class PassagensModel {

	private String nome;
	private String email;
	private int idade;
	private int quantidadeMalas;
	private String destino;

	public PassagensModel() {
	}

	public PassagensModel(String nome, String email, int idade, int quantidadeMalas, String destino) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.quantidadeMalas = quantidadeMalas;
		this.destino = destino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getQuantidadeMalas() {
		return quantidadeMalas;
	}

	public void setQuantidadeMalas(int quantidadeMalas) {
		this.quantidadeMalas = quantidadeMalas;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();

		modelo.append("Nome -> " + this.nome);
		modelo.append("Email -> " + this.email);
		modelo.append("Idade -> " + this.idade);
		modelo.append("Quantidade de Malas -> " + this.quantidadeMalas);
		modelo.append("Destino ->" + this.destino);

		return modelo.toString();
	}
}
