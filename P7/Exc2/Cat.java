public class Cat {

    private String _name;
    private int _age;

    public Cat(String name, int age) {
        _name = name;
        _age = age;
    }

    public String getName() { return _name; }
    public void setName(String name) { _name = name; }

    public int getAge() { return _age; }
    public void setAge(int age) { _age = age; }
    

    @Override
    public String toString() { return "(" + _name + ", " + _age + ")"; }
}
