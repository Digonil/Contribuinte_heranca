package br.com.udemy.entities;

public class PessoaJuridica extends Contribuintes{
	
	private Integer numeroFuncionarios;
	
	
	public PessoaJuridica() {
	
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
		super(name, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	
	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double calcularImposto() {
		Double renda = 0.0;
		if(this.numeroFuncionarios <= 10) {
			renda = (this.rendaAnual * 0.16);
		}else if (this.numeroFuncionarios > 10) {
			renda = (this.rendaAnual * 0.14);
		}
		return renda;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [numeroFuncionarios=" + numeroFuncionarios + "]";
	}
	
	

}
