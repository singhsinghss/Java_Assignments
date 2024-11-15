import java.util.ArrayList;
import java.util.Scanner;

public class IsArrayListEmpty {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements for Arraylist. Type 'done' to finish");
        ArrayList<String> languages=new ArrayList<>();
        while(sc.hasNextLine())
        {
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("done"))
            {
                break;
            }
            languages.add(input);
                      }
        if(!languages.isEmpty())
        {
            System.out.println("Arraylist size: "+languages.size());
            System.out.println("ArrayList elements: "+languages);
        }
        else
        {
            System.out.println("Arraylist is empty");
        }

    }
}
