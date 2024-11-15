public class SumOfArrayElements {

    public static void main(String [] args)
    {
        int [] numbers={5,10,15,20};
        int sum=findSumOfElements(numbers);
        System.out.println("Sum of an array elements are: "+sum);
    }

    private static int findSumOfElements(int[] numbers) {
        int sum=0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
