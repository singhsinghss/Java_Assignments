import java.util.Arrays;

public class FindMaxAndMin {

    public static void main(String[] args)
    {
        int [] numbers={3,9,1,7,5};
        getMinAndMaxElement(numbers);
    }

    private static void getMinAndMaxElement(int[] numbers) {
        Arrays.sort(numbers);
        int min=numbers[0];
        int max=numbers[numbers.length-1];
        System.out.println("minimum element in an array is: "+min);
        System.out.println("minimum element in an array is: "+max);
    }
}
