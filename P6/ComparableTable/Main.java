public class Main {

    public static void main(String[] args) {

        Table t1 = new Table(3); // table with 3 integers
        Table t2 = new Table(3); // table with 3 integers

        t1.setAll(3);
        t2.setAll(90);
        
        System.out.println(t1.compareTo(t2));  // <0
        
        System.out.println(Table.MAX_COMPARATOR.compare(t1, t2));     // <0
        System.out.println(Table.MAX_COMPARATOR.compare(t1, t1));     //  0
        System.out.println(Table.MAX_COMPARATOR.compare(t2, t2));     //  0
        System.out.println(Table.MAX_COMPARATOR.compare(t2, t1));     // >0
        System.out.println(Table.LENGTH_COMPARATOR.compare(t1, t2));  //  0 (same length)
        
    }
}
