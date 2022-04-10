package Entities;

public class OrderItem {
	private Product product;
	private Integer quantity;
	public OrderItem() {
	
	}
	public OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
	public Double subTotal( ) {
	
		double sum;
		sum = quantity * product.getPrice();
		return sum;
		
	}
	
	public String toString() {
		StringBuilder so = new StringBuilder();
		so.append(product.getName());
		so.append(", $" + product.getPrice());
		so.append(", quantity: " + this.quantity);
		so.append("Subtotal: " + subTotal());
		return so.toString();
	}
}
