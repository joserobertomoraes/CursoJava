package Application;

import java.util.Scanner;

import Entities.Quarto;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Quarto [] pensionato = new Quarto[10];
		int opcao;
		
		do {
			System.out.println("\n");
		System.out.println("------------------------");
		System.out.println("Pensionato");
		System.out.println("1-Fazer Reserva");
		System.out.println("2-Relatorio de vagas");
		System.out.println("3-Relatorio de Ocupação");
		System.out.println("4 - sair");
		System.out.print("Opção: ");
		opcao = sc.nextInt();
		System.out.println("------------------------");
		
		switch(opcao) {
		
		case 1:
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("nºQuarto: ");
			int quarto = sc.nextInt();
			if(pensionato[quarto] == null) {
				pensionato[quarto] = new Quarto(nome,email);
			}else {
				System.out.println("Quarto Ocupado");
			}
			break;
			
		case 2:
			System.out.print("Quartos disponiveis: ");
			for (int i = 0; i < pensionato.length; i++) {
				if(pensionato[i] == null) {
					System.out.print(i + " ");
				}
				
			}
			break;
			
		case 3:
			int cont = 0;
			for (int i = 0; i < pensionato.length; i++) {
				if(pensionato[i] != null) {
					System.out.println( pensionato[i] + "\nquarto= " + i +"\n");
					cont ++;
				}
			}
			break;
		}
	
		
		
		
		
		
		} while(opcao != 4);
		
		sc.close();

	
		
		
		
		
	}

}
