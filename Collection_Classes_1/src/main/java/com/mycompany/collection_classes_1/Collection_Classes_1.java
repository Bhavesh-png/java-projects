package com.mycompany.collection_classes_1;
import java.util.*;

public class Collection_Classes_1 {

    public static void main(String[] args) {

        arraysDemo();
        arrayListDemo();
        hashMapDemo();
        linkedListDemo();
        linkedHashSetDemo();
        stackDemo();
        vectorDemo();
        hashtableDemo();
        hashSetDemo();
    }

    // 1. Arrays
    static void arraysDemo() {
        System.out.println("\n**** Arrays Collection Class ****");

        int ar[] = {10, 20, 30};
        Arrays.sort(ar);

        System.out.println("Array Elements: " + Arrays.toString(ar));

        int index = Arrays.binarySearch(ar, 20);
        System.out.println("Index of 20: " + index);

        int cp[] = Arrays.copyOf(ar, 3);
        System.out.println("Copied Array: " + Arrays.toString(cp));
    }

    // 2. ArrayList
    static void arrayListDemo() {
        System.out.println("\n**** ArrayList Collection Class ****");

        ArrayList<String> a = new ArrayList<>();

        a.add("IMCA");
        a.add("MCA");
        a.add("MBA");
        a.add("BCA");
        a.add("BBM");
        a.add("BBA");

        System.out.println("Size: " + a.size());

        System.out.println("Elements:");
        for (String s : a) {
            System.out.println(s);
        }

        a.remove("MCA");

        System.out.println("After removing MCA:");
        for (String s : a) {
            System.out.println(s);
        }

        System.out.println("Contains IMCA: " + a.contains("IMCA"));
        System.out.println("Is Empty: " + a.isEmpty());
    }

    // 3. HashMap
    static void hashMapDemo() {
        System.out.println("\n**** HashMap Collection Class ****");

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(100, "Bhavesh");
        hm.put(101, "Chirag");
        hm.put(102, "Rahul");

        System.out.println("Size: " + hm.size());

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }

        System.out.println("Contains Key 102: " + hm.containsKey(102));
        System.out.println("Contains Value Rahul: " + hm.containsValue("Rahul"));

        hm.clear();
        System.out.println("After Clear Size: " + hm.size());
    }

    // 4. LinkedList
    static void linkedListDemo() {
        System.out.println("\n**** LinkedList Collection Class ****");

        LinkedList<String> l = new LinkedList<>();

        l.add("IMCA");
        l.add("MCA");

        System.out.println("Elements: " + l);

        l.clear();
        System.out.println("After Clear Size: " + l.size());
    }

    // 5. LinkedHashSet
    static void linkedHashSetDemo() {
        System.out.println("\n**** LinkedHashSet Collection Class ****");

        LinkedHashSet<String> lh = new LinkedHashSet<>();

        lh.add("IMCA");
        lh.add("MCA");

        System.out.println("Elements: " + lh);

        lh.clear();
        System.out.println("After Clear Size: " + lh.size());
    }

    // 6. Stack
    static void stackDemo() {
        System.out.println("\n**** Stack Collection Class ****");

        Stack<String> st = new Stack<>();

        st.push("A");
        st.push("B");
        st.push("C");

        System.out.println("Elements: " + st);

        System.out.println("Top Element: " + st.peek());
        st.pop();

        System.out.println("After Pop: " + st);

        st.clear();
        System.out.println("After Clear Size: " + st.size());
    }

    // 7. Vector
    static void vectorDemo() {
        System.out.println("\n**** Vector Collection Class ****");

        Vector<String> v = new Vector<>();

        v.add("Bhavesh");
        v.add("Chirag");
        v.add("Rahul");

        System.out.println("Elements: " + v);

        v.remove("Rahul");

        System.out.println("After Remove: " + v);

        v.clear();
        System.out.println("After Clear Size: " + v.size());
    }

    // 8. Hashtable
    static void hashtableDemo() {
        System.out.println("\n**** Hashtable Collection Class ****");

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "Bhavesh");
        ht.put(2, "Chirag");

        for (Map.Entry<Integer, String> m : ht.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }

        ht.clear();
        System.out.println("After Clear Size: " + ht.size());
    }

    // 9. HashSet
    static void hashSetDemo() {
        System.out.println("\n**** HashSet Collection Class ****");

        HashSet<String> hs = new HashSet<>();

        hs.add("IMCA");
        hs.add("BBA");

        System.out.println("Elements: " + hs);

        hs.remove("BBA");

        System.out.println("After Remove: " + hs);

        hs.clear();
        System.out.println("After Clear Size: " + hs.size());
    }
}