import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_Numbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers to get result in sorted order ");
        ArrayList<Integer> numbers=new ArrayList<>();
        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }
            else
                break;
        }
        Collections.sort(numbers);
        System.out.println("Arraylist after sorting of numbers: ");
        System.out.print(numbers);
    }
}
