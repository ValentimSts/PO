import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Table t = new Table(3);

		t.setValue(0, 1);
		t.setValue(1, 2);
		t.setValue(2, 3);

		Iterator it = t.getForwardIterator();

		while (it.hasNext())
			System.out.print(it.next());
		System.out.println("");

		it = t.getReverseIterator();

		while (it.hasNext())
			System.out.print(it.next());
		System.out.println("");
	}
}
