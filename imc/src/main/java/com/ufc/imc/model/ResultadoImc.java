package com.ufc.imc.model;

public class ResultadoImc {

	private Double imc;

	public Double getImc() {
		return imc;
	}

	public void setImc(Double imc) {
		this.imc = imc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imc == null) ? 0 : imc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultadoImc other = (ResultadoImc) obj;
		if (imc == null) {
			if (other.imc != null)
				return false;
		} else if (!imc.equals(other.imc))
			return false;
		return true;
	}

}
