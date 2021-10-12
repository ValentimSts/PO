import java.util.Iterator;

public class Table {

	private int _vector[];

	private class ForwardIterator implements Iterator {

		private int _i = 0;

		@Override
		public boolean hasNext() { return _i < _vector.length; }
		@Override
		public Integer next() { return _vector[_i++]; }
	}

	private class ReverseIterator implements Iterator {

		private int _i = _vector.length-1;

		@Override
		public boolean hasNext() { return _i >= 0; }
		@Override
		public Integer next() { return _vector[_i--]; }
	}


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

	public Iterator getReverseIterator() { return new ReverseIterator(); }
    public Iterator getForwardIterator() { return new ForwardIterator(); }

}
