package com.ufc.imc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ufc.imc.model.ParametroImc;
import com.ufc.imc.model.ResultadoImc;
import com.ufc.imc.service.IImcService;

@RestController
public class ImcRestController {

	@Autowired
	private IImcService imcService;

	@RequestMapping(value = "/calcular", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResultadoImc calcular(@RequestBody ParametroImc parametroImc) {
		return imcService.calcularImc(parametroImc);
	}

}
