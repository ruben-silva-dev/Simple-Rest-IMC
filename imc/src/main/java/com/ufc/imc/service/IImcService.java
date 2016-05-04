package com.ufc.imc.service;

import com.ufc.imc.model.Parametro;
import com.ufc.imc.model.Resultado;

@FunctionalInterface
public interface IImcService {

	public Resultado calcularImc(Parametro param);

}
