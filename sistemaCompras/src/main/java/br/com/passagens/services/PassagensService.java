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

	private Map<Integer, OnibusModel> onibus = new HashMap<Integer, OnibusModel>();
	{
		{
			onibus.put(1, new OnibusModel("Empresa: Cometa", "Destino: Rio de Janeiro", "Duração: 2 horas de viagem.",
					20, 20, ""));
			onibus.put(2, new OnibusModel("Empresa: Estrela", "Destino: Santos",
					"Duração: 1 hora e 30 minutos de viagem.", 20, 20, ""));
			onibus.put(3, new OnibusModel("Empresa: Jato", "Destino: Minas Gerais",
					"Duração: 4 hora e 50 minutos de viagem.", 20, 20, ""));
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
			if (passagensModel.getDestino().equalsIgnoreCase("Rio de janeiro")) {
				onibus.get(1).setLugaresDisponiveis(onibus.get(1).getLugares() - 1);
			} else if (passagensModel.getDestino().equalsIgnoreCase("Santos")) {
				onibus.get(2).setLugaresDisponiveis(onibus.get(2).getLugares() - 1);
			} else if (passagensModel.getDestino().equalsIgnoreCase("Minas Gerais")) {
				onibus.get(3).setLugaresDisponiveis(onibus.get(3).getLugares() - 1);
			} else if (onibus.get(1).getLugaresDisponiveis() == 0) {
				onibus.get(1).setEsgotado("Esgotado");
			} else if (onibus.get(2).getLugaresDisponiveis() == 0) {
				onibus.get(2).setEsgotado("Esgotado");
			} else if (onibus.get(3).getLugaresDisponiveis() == 0) {
				onibus.get(3).setEsgotado("Esgotado");
			} else {
				resposta = "redirect:/erro";
			}
		}

		return resposta;
	}

}
