public class Main {
	public static void main(String[] args) {

		Cat c1 = new Cat("gay", 1, 4.3);
		Cat c2 = new Cat("tareco", 2, 8.7);

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));

		System.out.println(c1);
	}
}
