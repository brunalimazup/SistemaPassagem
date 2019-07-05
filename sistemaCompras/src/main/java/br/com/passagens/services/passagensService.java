package br.com.passagens.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import br.com.passagens.models.passagensModel;

@Service
public class passagensService {
	
	private List<passagensModel> clientes = new ArrayList<passagensModel>(); {{
		clientes.add(new passagensModel("Milena", "email", 20, 2));
	}};

}
