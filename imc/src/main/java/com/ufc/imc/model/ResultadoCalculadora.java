package com.ufc.imc.model;

public class ResultadoCalculadora {

	private String type;

	private Double firstValue;

	private Double secondValue;

	private Double result;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(Double firstValue) {
		this.firstValue = firstValue;
	}

	public Double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(Double secondValue) {
		this.secondValue = secondValue;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstValue == null) ? 0 : firstValue.hashCode());
		result = prime * result + ((this.result == null) ? 0 : this.result.hashCode());
		result = prime * result + ((secondValue == null) ? 0 : secondValue.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		ResultadoCalculadora other = (ResultadoCalculadora) obj;
		if (firstValue == null) {
			if (other.firstValue != null)
				return false;
		} else if (!firstValue.equals(other.firstValue))
			return false;
		if (result == null) {
			if (other.result != null)
				return false;
		} else if (!result.equals(other.result))
			return false;
		if (secondValue == null) {
			if (other.secondValue != null)
				return false;
		} else if (!secondValue.equals(other.secondValue))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
