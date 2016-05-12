package com.ufc.imc.service;

import com.ufc.imc.model.ParametroImc;
import com.ufc.imc.model.ResultadoImc;

public interface IImcService {

	public ResultadoImc calcularImc(ParametroImc param);

}
