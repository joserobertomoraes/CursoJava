package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
List<Shape> shape = new ArrayList<>();

System.out.print("Enter the number of shapes: ");
int quant = sc.nextInt();

for (int i = 0; i < quant; i++) {
	System.out.println("Shape #"+(i+1)+ " data: ");
	System.out.print("Rectangle or Circle(r/c): ");
	String opcao = sc.next();
	System.out.println("Color(BLACK/BLUE/RED): ");
	Color cor = Color.valueOf(sc.next());
	if(opcao.equalsIgnoreCase("r")) {
		System.out.print("Width: ");
		double with = sc.nextDouble();
		System.out.print("height: ");
		double heigth = sc.nextDouble();
		Shape shap = new Rectangle(cor,with,heigth);
		shape.add(shap);
	}else if (opcao.equalsIgnoreCase("c")) {
		System.out.print("Radius: ");
		double radius = sc.nextDouble();
		Shape shapc = new Circle(cor,radius);
		shape.add(shapc);
	}
}

System.out.println("SHAPE AREAS: ");
for (Shape s : shape) {
	System.out.println(String.format("%.2f", s.area()));
}

sc.close();
	}

}
