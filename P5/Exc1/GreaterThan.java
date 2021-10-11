public class GreaterThan implements SelectionPredicate {

	private int _x = 0;

	public GreaterThan(int x) { _x = x; }

	@Override
	public boolean ok(int n) {
		return _x < n;
	}
}
