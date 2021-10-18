import java.util.Map;
import java.util.HashMap;


public class CatRegistry {
    
    private Map<String, Cat> _cats;

    public CatRegistry() { _cats = new HashMap<String, Cat>(); }

    public Cat get(String name) throws NoSuchCatException {
        Cat cat = _cats.get(name);
        if(cat == null) 
            throw new NoSuchCatException();
        return cat;
    }

    public void put(Cat c) throws DuplicateCatException {
        if(_cats.containsKey(c.getName())) 
            throw new DuplicateCatException();
        _cats.put(c.getName(), c);
    }

}
