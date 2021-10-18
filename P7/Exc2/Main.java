public class Main {
    
    public static void main(String[] args) {

        CatRegistry registry = new CatRegistry();

        Cat c1 = new Cat("a", 1);

        try {
            registry.put(c1);
            System.out.println("One c1 registered.");
            registry.put(new Cat("a", 2));
            System.out.println("Hopefully still just one Tareco registered."); // This shouldn't be executed
        }
        catch (DuplicateCatException e) {
            System.out.println("------  SOMETHING EXPLODED ------------------------------------");
            e.printStackTrace();
            System.out.println("--------------------------------------------------------------");
        }

        try {
            Cat c = registry.get("a");
            System.out.println(c); // Prints (Tareco, 42), since it exploded instead of inserting (Tareco, 2)
            registry.get("Simba");
        }
        catch (NoSuchCatException e) {
            System.out.println("------ SOMETHING EXPLODED ------------------------------------");
            e.printStackTrace();
            System.out.println("--------------------------------------------------------------");
        }

        System.out.println("Still Alive");
        
    }
}
