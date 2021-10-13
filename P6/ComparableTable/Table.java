import java.util.Comparator;

public class Table implements Comparable<Table>{

	private int _vector[];

	public static final Comparator<Table> MAX_COMPARATOR = new MaxComparator();
	public static final Comparator<Table> LENGTH_COMPARATOR = new LengthComparator();

	private static class MaxComparator implements Comparator<Table> {

		@Override
		public int compare(Table t1, Table t2) {
			return t1.getMax() - t2.getMax();
		}
	}

	private static class LengthComparator implements Comparator<Table> {

		@Override
		public int compare(Table t1, Table t2) {
			return t1.getLength() - t2.getLength();
		}
	}


	// Table basic Methods
	// --------------------------------------------------
	public Table(int x) { _vector = new int[x]; }
	public int getValue(int i) {
		if(i >= 0 && i < _vector.length)
			return _vector[i];
		return 0;
	}

	public void setValue(int x, int i) {
		if(i >= 0 && i < _vector.length)
			_vector[i] = x;
	}

	public void setAll(int x) {
		for(int i = 0; i < _vector.length; i++)
			setValue(x, i);
	}
	// --------------------------------------------------

	public int getMax() {
		int max = _vector[0];
		for(int i: _vector)
			if(i > max) max = i;
		return max;
	}

	public int getSum() {
		int sum = 0;
		for(int i: _vector)
			sum += i;
		return sum;
	}

	public int getLength() {
		return _vector.length;
	}


	@Override
	public int compareTo(Table t2) {
		return getSum() - t2.getSum();
	}
}
