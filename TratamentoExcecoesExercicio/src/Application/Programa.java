package Application;

import java.util.Scanner;

import Entities.Account;
import Exceptions.BusinessException;



public class Programa {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
	
		Account conta = new Account();
	
		System.out.print("Numero da conta: ");
		int contaBanc = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deposito Inicial: ");
		double valor = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limite = sc.nextDouble();
		conta = new Account(contaBanc,nome,valor,limite);
		
		
		System.out.print("digite o valor para saque: ");
		double saque = sc.nextDouble();
	
		try {
			conta.saque(saque);
			System.out.println(conta.toString());
		}
		catch(BusinessException e )
		{
			System.out.println(e.getMessage());
		}

	
	
sc.close();	
	}	
	
}
