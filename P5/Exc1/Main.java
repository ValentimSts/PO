public class Main {
	public static void main(String[] args) {

		Table t = new Table(3);  // table with 3 integers

		t.setAll(8);

		SelectionPredicate p1 = new GreaterThan(9);

		if (t.contains(p1))
			System.out.println("YES");
		else 
			System.out.println("NO");

		t.setAll(2);

		SelectionPredicate p2 = new EqualTo(2);

		if (t.contains(p2))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
