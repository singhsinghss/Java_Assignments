

public class Reverse_Array {

    public static void main(String[] args)
    {
        String [] animals={"cat","dog","bird","fish"};
        reverseAnArray(animals);
    }

    private static void reverseAnArray(String[] animals) {
        System.out.println("Reversed array elements are: ");

        for (String animal : animals) {

            StringBuilder reverseElement = new StringBuilder(animal);
            reverseElement.reverse();
            reverseElement.append(" ");
            System.out.print(reverseElement);
        }

    }
}
