package br.com.passagens.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.passagens.models.OnibusModel;
import br.com.passagens.models.PassagensModel;

@Service
public class PassagensService {

	private List<PassagensModel> clientes = new ArrayList<PassagensModel>();
	{
		{
			clientes.add(new PassagensModel("Milena", "email", 20, 2));
		}
	};

	private List<String> cometaLugares = new ArrayList<String>();
	private List<String> EstrelaLugares = new ArrayList<String>();

	private Map<Integer, OnibusModel> onibus = new HashMap<Integer, OnibusModel>();
	{
		{
			onibus.put(1, new OnibusModel("Cometa", "Rio", "2 horas", 20, cometaLugares));
			onibus.put(2, new OnibusModel("Estrela", "Santos", "1 hora e 30 minutos", 20, EstrelaLugares));
		}
	}

	public Collection<OnibusModel> mostrarEmpresas() {
		return this.onibus.values();
	}

	public String salvarCompra(PassagensModel passagensModel) {
		String resposta;
		if (passagensModel.getIdade() >= 18) {
			clientes.add(passagensModel);
			resposta = "redirect:\"";
		} else{
			resposta = "redirect:error.html";
		}
		return resposta;
	}

	public void criarLugaresCometa() {
		for (int i = 0; i < onibus.get(1).getLugares(); i++) {
			cometaLugares.add("C" + i);
		}
	}

	public void criarLugatesEstrela() {
		for (int i = 0; i < onibus.get(2).getLugares(); i++) {
			cometaLugares.add("E" + i);
		}
	}

	public List<String> mostrarlista() {
		return this.cometaLugares;
	}
}
