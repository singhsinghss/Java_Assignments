package practice_java_class;

import java.util.HashSet;

public class HashSet_Example {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        System.out.println("initial hashset: "+hashSet);
        hashSet.add("Apple");
        hashSet.add("Banana");
        System.out.println("After adding duplictaes: "+hashSet);

        boolean hasCherry=hashSet.contains("Cherry");
        System.out.println("Has cherry? "+hasCherry);

        hashSet.remove("Date");
        System.out.println("After removing Date: "+hashSet);

        System.out.println("Size of Hashset "+hashSet.size());
        System.out.println("Is empty? "+hashSet.isEmpty());
    }
}
