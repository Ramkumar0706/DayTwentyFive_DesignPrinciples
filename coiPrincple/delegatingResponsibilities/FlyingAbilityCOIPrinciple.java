package coiPrincple.delegatingResponsibilities;

public class FlyingAbilityCOIPrinciple {
	public void fly() {
		System.out.println("Flying");
	}
}

class Sparrows {
	private FlyingAbilityCOIPrinciple flyingAbility;

	public Sparrows() {
		this.flyingAbility = new FlyingAbilityCOIPrinciple();
	}

	public void fly() {
		flyingAbility.fly();
	}
}