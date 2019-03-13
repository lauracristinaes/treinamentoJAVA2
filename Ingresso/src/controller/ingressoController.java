package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ingressoController {

	
	@RequestMapping("inicio")
	public String executa() {
		
		return "vendaIngresso";
	}
	
	@RequestMapping("escolha")
	public String executaForm() {
		
		return "mostraValor";
	}
}
