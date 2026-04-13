
import java.util.Vector;


public class CollectionDemo {

    public static void main(String[] args) {
// 2. Vector Example
        System.out.println("- - - Vector - - -");
        Vector<String> vector = new Vector<>();
        vector.add("java");
        vector.add("Python");
        vector.add("C++");
        System.out.println("vector Elements: " + vector);
        vector.remove("Python");
        System.out.println("Vector after removal: " + vector);
        System.out.println("Iterating Vector: ");
        for (String lang : vector) {
            System.out.println(lang);
        }
        
    }
}
