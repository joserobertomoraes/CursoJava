package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrdemStatus;

public class program {
	
	public static void main(String[] args) throws ParseException {
		

	
		Client c1 = new Client();
		Order o1 = new Order();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
			System.out.println("Enter cliente data: ");
			System.out.print("Name: ");
			c1.setName(sc.nextLine());
			System.out.print("Email: ");
			c1.setEmail(sc.next());
			System.out.print("Birth date(DD/MM/YYYY)");
			c1.setBirthDate(sdf.parse(sc.next()));
			o1.setCliente(c1);
			System.out.println("Enter order data: ");
			System.out.print("status:");
			o1.setStatus(OrdemStatus.valueOf(sc.next()));
			System.out.print("How many items to this order?");
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				System.out.println("Enter #"+(i+1) + " item data:");
				sc.nextLine();
				System.out.print("Product name: ");
				String name = sc.nextLine();
				System.out.print("Product price: ");
				double price = sc.nextDouble();
				System.out.print("Quantity: ");
				int quant = sc.nextInt();
				Product p1 = new Product(name, price);
				OrderItem oi1 = new OrderItem(p1,quant);
				o1.addItem(oi1);
			
			
			}
			
		System.out.println(o1);
		
		sc.close();
		
		
	}

}
