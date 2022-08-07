package br.com.udemy.entities;

public class PessoaFisica extends Contribuintes{
	
	private Double gastosSaude;
	
	public PessoaFisica() {
	
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}


	@Override
	public Double calcularImposto() {
		
		Double renda = 0.0;
		if(super.rendaAnual < 20000) {
			renda = (this.rendaAnual * 0.15) - (gastosSaude * .5);
		}else if (super.rendaAnual >= 20000) {
			renda = (this.rendaAnual * 0.25) - (gastosSaude * .5);
		}
		return renda;
	}

	@Override
	public String toString() {
		return "PessoaFisica [gastosSaude=" + gastosSaude + "]";
	}
	
	

	
}
