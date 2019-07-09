package br.com.passagens.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import br.com.passagens.models.OnibusModel;
import br.com.passagens.models.PassagensModel;

@Service
public class PassagensService {

	private List<PassagensModel> clientes = new ArrayList<PassagensModel>();
	private Random aleatorio = new Random();

	private Map<Integer, OnibusModel> onibus = new HashMap<Integer, OnibusModel>();
	{
		{
			onibus.put(1, new OnibusModel("Cometa", "Rio", "2 horas", 20, 20));
			onibus.put(2, new OnibusModel("Estrela", "Santos", "1 hora e 30 minutos", 20, 20));
		}
	}

	public Collection<OnibusModel> mostrarEmpresas() {
		return this.onibus.values();
	}

	public String salvarCompra(PassagensModel passagensModel) {
		String resposta;
		if (passagensModel.getIdade() >= 18) {
			clientes.add(passagensModel);
			resposta = "redirect:/sucesso";
		} else {
			resposta = "redirect:/erro";
		}

		if (resposta == "redirect:/sucesso") {
			if (passagensModel.getDestino().equalsIgnoreCase("Rio")) {
				onibus.get(1).setLugaresDisponiveis(onibus.get(1).getLugares() - 1);
			} else if (passagensModel.getDestino().equalsIgnoreCase("Santos")) {
				onibus.get(2).setLugaresDisponiveis(onibus.get(1).getLugares() - 1);
			} else {
				resposta = "redirect:/erro";
			}
		}

		return resposta;
	}

}
