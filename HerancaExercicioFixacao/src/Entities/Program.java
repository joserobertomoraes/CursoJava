package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
List<Product> product = new ArrayList<>();
System.out.print("Enter the number of products: ");
int quant = sc.nextInt();

for (int i = 0; i <quant; i++) {
	System.out.println("product #" + (i+1) + " data: ");
	System.out.print("Commom, used ot imported(c/u/i): ");
	String opcao = sc.next();
	System.out.print("name: ");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.print("price: ");
	double price = sc.nextDouble();
	
if(opcao.equalsIgnoreCase("c")) {
	Product prod = new Product(name, price);
	product.add(prod);
} else if(opcao.equalsIgnoreCase("i")) {
	System.out.print("Customs fee: ");
	double custom = sc.nextDouble();
	Product prodi = new ImportedProduct(name,price,custom);
	product.add(prodi);
}else if(opcao.equalsIgnoreCase("u")) {
	System.out.print("Manufacture date (DD/MM/YYYY): ");
	Date date = sdf.parse(sc.next());
	Product produ = new UsedProduct(name,price,date);
	product.add(produ);
}
}


System.out.println("PRICE TAGS: ");
for (Product product2 : product) {
	System.out.println(product2);
}


sc.close();

	}

}
