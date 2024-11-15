
import java.util.Arrays;

public class FindSecondLargestElement {

    public static void main(String[] args)
    {
        int [] numbers={45,76,34,89,76};
        getSecondLargestNum(numbers);
    }

    private static void getSecondLargestNum(int[] numbers) {
        Arrays.sort(numbers);
        int secondLargestElement=(numbers[numbers.length-2]);
        System.out.println("Second largest element from an array is: "+secondLargestElement);
    }
}
