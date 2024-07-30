package dryPrincple;

public class OrderService {
	public double calculateDiscount(double totalAmount) {
		double discount = 0;
		if (totalAmount > 100) {
			discount = totalAmount * 0.1;
		}
		return discount;
	}

	public double calculateTax(double totalAmount) {
		double tax = 0;
		if (totalAmount > 100) {
			tax = totalAmount * 0.05;
		}
		return tax;
	}
}
