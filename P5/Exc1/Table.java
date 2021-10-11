public class Table {

	private int _vector[];

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
			_vector[i] = x;
	}

	public boolean contains(SelectionPredicate p) {
		for(int i = 0; i < _vector.length; i++)
			if(p.ok(_vector[i]))
				return true;
		return false;
	}

}
