package br.com.passagens.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import br.com.passagens.models.PassagensModel;

@Service
public class PassagensService {
	
	private List<PassagensModel> clientes = new ArrayList<PassagensModel>(); {{
		clientes.add(new PassagensModel("Milena", "email", 20, 2));
	}};

}
