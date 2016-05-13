package com.ufc.imc.controller;

import static com.ufc.imc.util.Constants.PAGINA_IMC;
import static com.ufc.imc.util.Constants.PARAMETRO;
import static com.ufc.imc.util.Constants.RESULTADO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ufc.imc.model.ParametroImc;
import com.ufc.imc.model.ResultadoImc;
import com.ufc.imc.service.IImcService;

@Controller
public class ImcController {

	@Autowired
	private IImcService imcService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String imcForm() {
		return PAGINA_IMC;
	}

	@RequestMapping(value = "/calcular", method = RequestMethod.GET)
	public String calcular(Model model, ParametroImc param) {
		ResultadoImc result = imcService.calcularImc(param);
		model.addAttribute(RESULTADO, result);
		return PAGINA_IMC;
	}

	@ModelAttribute(PARAMETRO)
	public ParametroImc create() {
		return new ParametroImc();
	}

}
