package dryPrincple;

public abstract class HumanDryPrincple {
	public abstract void speak();

}

class Men extends HumanDryPrincple{

	@Override
	public void speak() {
		System.out.println("The Men is Speaking");		
	}

}

class Women extends HumanDryPrincple{

	@Override
	public void speak() {
		System.out.println("The Women is Speaking");		
	}

}
