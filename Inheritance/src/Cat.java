
public class Cat extends Animal {

	// force all new cat instances to have legs
	public Cat(String name) {
		super(name, true);
		// TODO Auto-generated constructor stub
	}

	public Cat() {
		this.setHasLegs(true);
		// TODO Auto-generated constructor stub
	}

}
