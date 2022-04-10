package Entities;

public class PessoaJuridica extends Contribuintes{

	private Integer numeroFuncionario;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	
	@Override
	public  Double Imposto() {
		double imposto;
		if(numeroFuncionario > 10) {
			imposto = super.rendaAnual *0.14;
		} else {
			imposto = super.getRendaAnual() * 0.16;
		}
		
		
		return imposto;
		
	}
	
}
