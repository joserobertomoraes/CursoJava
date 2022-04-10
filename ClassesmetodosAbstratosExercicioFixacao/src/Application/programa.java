package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Contribuintes;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

public class programa {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Contribuintes> contribuintes = new ArrayList<>();
	double sum = 0.0;
	
	System.out.print("Enter the number of tax payers: ");
	int quant = sc.nextInt();
	
	for (int i = 0; i < quant; i++) {
		System.out.println("Tax payer  #"+(i+1) +" data:");
		System.out.print("Individual or Company(i/c) :");
		String opcao = sc.next();
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Anual Income: ");
		double anual = sc.nextDouble();
		if(opcao.equalsIgnoreCase("i")) {
			System.out.print("Health expenditures: ");
			double saude = sc.nextDouble();
			Contribuintes pf = new PessoaFisica(name,anual,saude);
			contribuintes.add(pf);
		}else if(opcao.equalsIgnoreCase("c")) {
			System.out.print("Number of employees: ");
			int func = sc.nextInt();
			Contribuintes pj = new PessoaJuridica(name,anual,func);
			contribuintes.add(pj);
		}
		
	}
	
	System.out.println("TAXES PAID: ");
	for (Contribuintes c : contribuintes) {
		sum += c.Imposto();
		System.out.println(c.getNome() + ": $ "+ String.format("%.2f", c.Imposto()));
	}
	

	
	System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
	
	sc.close();

	}

}
