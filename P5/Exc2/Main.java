public class Main {

	public static void main(String[] args) {

		Table t = new Table(3);

		t.setAll(68);

		Successor s1 = new Successor();
		Square s2 = new Square();

		t.print(s1);
		t.print(s2);
	}
}
