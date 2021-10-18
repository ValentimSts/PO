import java.util.Map;
import java.util.HashMap;

public class DogRegistry {
    
    private Map<String, Dog> _dogs;

    public DogRegistry() { _dogs = new HashMap<String, Dog>(); }

    public void insert(Dog d) throws DogAlreadyKnownException{
        if(_dogs.get(d.getName()) != null)
            throw new DogAlreadyKnownException();
        _dogs.put(d.getName(), d);
    }

    public Dog find(String name) throws DogNotFoundException {
        Dog d = _dogs.get(name);
        if(d == null)
            throw new DogNotFoundException();
        return d;
    }
}
