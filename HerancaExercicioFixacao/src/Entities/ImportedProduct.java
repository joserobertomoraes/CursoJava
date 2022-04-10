package Entities;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	
	public ImportedProduct() {
		
	}


	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomsFee() {
		return customsFee;
	}


	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
	double total = price  + customsFee;
		return total;
	}
	
	@Override
	public String toString() {
		return  super.getName() + " $ " + String.format("%.2f", totalPrice()) +" ( Customs fee: $" + customsFee +")";
	}
	
}
