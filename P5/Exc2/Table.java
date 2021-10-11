public class Table {

	private int _vector[];

	public Table(int x) {
		_vector = new int[x];
	}

	public int getValue(int i) {
		if(i >= 0 && i < _vector.length)
			return _vector[i];
		return 0;
	}

	public void setValue(int n, int i) {
		if(i >= 0 && i < _vector.length)
			_vector[i] = n;
	}

	public void setAll(int n) {
		for(int i = 0; i < _vector.length; i++)
			setValue(n, i);
	}

	public void print(Transform el) {
		for(int i = 0; i < _vector.length; i++)
			System.out.println(el.transform(_vector[i]));
	}
}
