package dryPrincple;

public class DryOrderService {

	public double calculateDiscount(double totalAmount) {
		return calculatePercentage(totalAmount, 0.1);
	}

	public double calculateTax(double totalAmount) {
		return calculatePercentage(totalAmount, 0.05);
	}

	private double calculatePercentage(double amount, double percentage) {
		return amount > 100 ? amount * percentage : 0;
	}

}
