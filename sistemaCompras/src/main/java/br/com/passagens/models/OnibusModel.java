package br.com.passagens.models;

import java.util.List;

public class OnibusModel {

	private String empresa;
	private String destino;
	private String tempoDeViagem;
	private int lugares;
	private int lugaresDisponiveis;
	private List<PassagensModel> cliente;

	public OnibusModel() {
	}

	public OnibusModel(String empresa, String destino, String tempoDeViagem, int lugares, int lugaresDisponiveis) {
		this.empresa = empresa;
		this.destino = destino;
		this.tempoDeViagem = tempoDeViagem;
		this.lugares = lugares;
		this.lugaresDisponiveis = lugaresDisponiveis;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTempoDeViagem() {
		return tempoDeViagem;
	}

	public void setTempoDeViagem(String tempoDeViagem) {
		this.tempoDeViagem = tempoDeViagem;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public int getLugaresDisponiveis() {
		return lugaresDisponiveis;
	}

	public void setLugaresDisponiveis (int lugaresDisponiveis) {
		this.lugaresDisponiveis = lugaresDisponiveis;
	}

	public List<PassagensModel> getCliente() {
		return cliente;
	}

	public void setCliente(List<PassagensModel> cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {

		StringBuilder modelo = new StringBuilder();

		modelo.append("Empresa" + this.empresa);
		modelo.append("Destino" + this.destino);
		modelo.append("TempoDeViagem" + this.tempoDeViagem);
		modelo.append("Lugares" + this.lugares);
		modelo.append("Quantidade de lugares" + this.lugares);

		return modelo.toString();
	}

}
