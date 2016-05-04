package com.ufc.imc.service.impl;

import org.springframework.stereotype.Service;

import com.ufc.imc.model.Parametro;
import com.ufc.imc.model.Resultado;
import com.ufc.imc.service.IImcService;

@Service
public class ImcService implements IImcService {

	@Override
	public Resultado calcularImc(Parametro param) {
		Resultado result = new Resultado();
		
		Double imc =  param.getPeso() / (param.getAltura() * param.getAltura());
		
		result.setImc(imc);
		
		return result;
	}

}
