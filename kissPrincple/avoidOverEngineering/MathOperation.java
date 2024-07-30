package kissPrincple.avoidOverEngineering;

interface Operation {
	double apply(double a, double b);
}

public class MathOperation {
	public static double performOperation(Operation operation, double a, double b) {
		return operation.apply(a, b);
	}
}

class Addition implements Operation {
	public double apply(double a, double b) {
		return a + b;
	}
}

class Subtraction implements Operation {
	public double apply(double a, double b) {
		return a - b;
	}
}
