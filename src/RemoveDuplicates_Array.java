import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicates_Array {

    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("cherry");
        System.out.println("Arraylist with duplicates: ");
        System.out.println(fruits);

        LinkedHashSet<String> distinct_Elements=new LinkedHashSet<>(fruits);
        System.out.println("ArrayList after removing duplicates: ");
        System.out.println(distinct_Elements);
    }
}
