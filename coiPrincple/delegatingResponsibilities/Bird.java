package coiPrincple.delegatingResponsibilities;

//Using inheritance
public class Bird {
	public void fly() {
		System.out.println("Flying");
	}
}

class Sparrow extends Bird {
	public void fly() {
		super.fly();
	}
}


