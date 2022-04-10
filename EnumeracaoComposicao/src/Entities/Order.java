package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enums.OrdemStatus;

public class Order {
	List<OrderItem> pedido = new ArrayList<>();
	private Client cliente;
	 private Date moment = new Date();
	 private OrdemStatus status;
	
	 
	 public Order() {

	}

	 
	public Order(Client cliente, OrdemStatus status) {
	
		this.cliente = cliente;
		this.status = status;
	}





	public List<OrderItem> getPedido() {
		return pedido;
	}


	public Client getCliente() {
		return cliente;
	}


	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}


	public OrdemStatus getStatus() {
		return status;
	}


	public void setStatus(OrdemStatus status) {
		this.status = status;
	}


	public void addItem(OrderItem item) {
		pedido.add(item);
	}
	 
	public void removeItem(OrderItem item) {
		pedido.remove(item);
	}
	
	public Double Total() {
		double sum = 0;
		for (OrderItem c : pedido) {
			sum += c.subTotal();
		}
		return sum;
	}


	@Override
	public String toString() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss\" ");
		//String data = new SimpleDateFormat("dd/MM/yyyy").format(moment);
		//String hora = new SimpleDateFormat("HH:mm:ss").format(moment);
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY \n");
		sb.append("order moment: " + sdf2.format(moment) +"\n" );
		sb.append("Status: " + this.status +"\n");
		sb.append("Client: " + cliente.getName() + "("+ sdf1.format(cliente.getBirthDate()) + ") -"+ cliente.getEmail()  +"\n");
		sb.append("Order items: \n");
	
		for (OrderItem o : pedido) {
			sb.append(o.toString() + "\n");
		}
		
		sb.append("total: " + Total());
	
		return sb.toString();
	}
	
}
