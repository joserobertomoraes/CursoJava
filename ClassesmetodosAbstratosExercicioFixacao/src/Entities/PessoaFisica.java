package Entities;

public class PessoaFisica extends Contribuintes{

	private Double saude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double saude) {
		super(nome, rendaAnual);
		this.saude = saude;
	}

	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}
	
	@Override
	public  Double Imposto() {
		double imposto;
		if(super.getRendaAnual() <20000.00 && saude > 0) {
			imposto = super.getRendaAnual() *0.15 - saude * 0.50;
		} else {
			imposto = super.getRendaAnual() * 0.25 - saude * 0.50;
		}
		
		
		return imposto;
		
	}
}
