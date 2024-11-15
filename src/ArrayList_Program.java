import java.util.ArrayList;

public class ArrayList_Program {

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("John");
        names.add("Emma");
        names.add("Ava");
        names.add("Liam");
        names.add("Olivia");

        System.out.print(names);
        names.remove(2);
        //System.out.println(names.size());
        names.remove(names.size()-1);
        System.out.println("List after removing names at 2nd and 4th index: ");
        System.out.println(names);
    }
}