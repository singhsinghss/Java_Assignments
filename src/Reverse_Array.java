import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args)
    {
        String [] animals={"cat","dog","bird","fish"};
        reverseAnArray(animals);
    }

    private static void reverseAnArray(String[] animals) {
        System.out.println("Reversed array elements are: ");
        StringBuilder reverseElement = null;

        for (int i=0;i<animals.length;i++) {

            reverseElement= new StringBuilder(animals[i]);
            reverseElement.reverse();
            reverseElement.append(" ");
            System.out.print(reverseElement.toString());
        }

    }
}
