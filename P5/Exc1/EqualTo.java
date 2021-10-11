public class EqualTo implements SelectionPredicate {

	private int _x = 0;

	public EqualTo(int x) { _x = x; }

	@Override
	public boolean ok(int n) {
		return _x == n;
	}
}
