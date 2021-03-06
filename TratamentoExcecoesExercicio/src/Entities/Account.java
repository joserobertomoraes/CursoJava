package Entities;

import javax.management.RuntimeErrorException;

import Exceptions.BusinessException;

public class Account {

	private Integer numero;
	private String  titular;
	private Double valor;
	private Double limiteSaque;
	
	
	
	public Account() {
	
	}



	public Account(Integer numero, String titular, Double valor, Double limiteSaque) {
	
		this.numero = numero;
		this.titular = titular;
		this.valor = valor;
		this.limiteSaque = limiteSaque;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public Double getValor() {
		return valor;
	}





	public Double getLimiteSaque() {
		return limiteSaque;
	}


	
	public void Deposito(Double valor) {
		this.valor += valor;
	}
	
	
	public void saque(Double saque) {
		validarSaque(saque);
		this.valor -= saque;
	}
	
	public String toString() {
		return "saldo: "+ this.valor;
	}
	
	private void validarSaque(double saque)  {
		if(saque > getLimiteSaque()  ) {
			throw new BusinessException("Erro de saque: A quantia excede o limte de saque");
		}
		if(saque > getValor()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente") ;
		}
			
		
	}
}
