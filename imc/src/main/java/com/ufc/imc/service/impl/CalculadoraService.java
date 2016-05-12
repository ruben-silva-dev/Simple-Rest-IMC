package com.ufc.imc.service.impl;

import static com.ufc.imc.util.Constants.URL_CALCULADORA;
import static com.ufc.imc.util.Constants.SUM;
import static com.ufc.imc.util.Constants.SUBTRACT;
import static com.ufc.imc.util.Constants.MULTIPLY;
import static com.ufc.imc.util.Constants.DIVIDE;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ufc.imc.model.ParametroCalculadora;
import com.ufc.imc.model.ResultadoCalculadora;
import com.ufc.imc.service.ICalculadoraService;

@Service
public class CalculadoraService implements ICalculadoraService {

	@Override
	public Double somar(Double valor1, Double valor2) {
		ParametroCalculadora parametro = this.create(SUM, valor1, valor2);
		return this.calcular(parametro);
	}

	@Override
	public Double subtrair(Double valor1, Double valor2) {
		ParametroCalculadora parametro = this.create(SUBTRACT, valor1, valor2);
		return this.calcular(parametro);
	}

	@Override
	public Double multiplicar(Double valor1, Double valor2) {
		ParametroCalculadora parametro = this.create(MULTIPLY, valor1, valor2);
		return this.calcular(parametro);
	}

	@Override
	public Double dividir(Double valor1, Double valor2) {
		ParametroCalculadora parametro = this.create(DIVIDE, valor1, valor2);
		return this.calcular(parametro);
	}

	private ParametroCalculadora create(String type, Double valor1, Double valor2) {
		ParametroCalculadora parametro = new ParametroCalculadora();

		parametro.setType(type);
		parametro.setFirstValue(valor1);
		parametro.setSecondValue(valor2);

		return parametro;
	}

	private Double calcular(ParametroCalculadora parametroCalculadora) {
		RestTemplate template = new RestTemplate();

		ResultadoCalculadora resultado = template.postForObject(URL_CALCULADORA, parametroCalculadora,
				ResultadoCalculadora.class);

		return resultado.getResult();
	}
}
