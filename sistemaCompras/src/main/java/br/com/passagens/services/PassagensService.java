package br.com.passagens.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

	private List<OnibusModel> onibus = new ArrayList<OnibusModel>();
	{
		{
			onibus.add(new OnibusModel("Cometa", "Rio", "2 horas", 20));
			onibus.add(new OnibusModel("Estrela", "Santos", "1 hora e 30 minutos", 20));
		}
	}

	public Collection<OnibusModel> mostrarEmpresas() {
		return this.onibus;
	}

	public String salvarCompra(PassagensModel passagensModel) {
		String resposta = "Compra realizada.";
		if (passagensModel.getIdade() >= 18) {
			clientes.add(passagensModel);
		} else {
			resposta = "Você não possue idade para realizar essa compra.";
		}
		return resposta;
	}
	
	private Collection <OnibusModel> mostrarlista(){
		return this.onibus;
	}
}
