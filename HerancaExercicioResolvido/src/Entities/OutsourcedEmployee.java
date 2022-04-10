package Entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourcedEmployee()
	{
		
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	
	@Override
	public Double payment() {
		double addition = additionalCharge *110/100;
		double salary = valuePerHour * hours + addition;
		return salary;
	}
	
	public String toString() {
		return super.getName() + " - $  " + String.format("%.2f", payment());
	}
}

