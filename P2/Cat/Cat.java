public class Cat {
	
	private int age;
	private String name;
	private double weight;

	public Cat(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String new_name) {
		this.name = new_name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int new_age) {
		this.age = new_age;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double new_weight) {
		this.weight = new_weight;
	}

	@Override
	public boolean equals(Object x) {
		if(x instanceof Cat) {
			Cat new_cat = (Cat) x;
			return getName().equals(new_cat.getName()) && getAge() == new_cat.getAge() && getWeight() == getWeight();
		}
		return false;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", Age: " + getAge() + ", Weight: " + getWeight();
	}

}
