package com.ufc.imc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.imc.model.ParametroImc;
import com.ufc.imc.model.ResultadoImc;
import com.ufc.imc.service.ICalculadoraService;
import com.ufc.imc.service.IImcService;

@Service
public class ImcService implements IImcService {

	@Autowired
	private ICalculadoraService calculadora;

	@Override
	public ResultadoImc calcularImc(ParametroImc param) {
		Double alturaAoQuadrado = calculadora.multiplicar(param.getAltura(), param.getAltura());
		Double imc = calculadora.dividir(param.getPeso(), alturaAoQuadrado);

		ResultadoImc result = new ResultadoImc();
		result.setImc(imc);

		return result;
	}

}
