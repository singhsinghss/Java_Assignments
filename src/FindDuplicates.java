public class FindDuplicates {

    public static void main(String[] args)
    {
        String [] fruits={"apple","banana","apple","cherry","banana"};
        printDuplicateElements(fruits);
    }

    private static void printDuplicateElements(String[] fruits) {
        System.out.println("Duplicate elements are: ");
        for(int i=0;i<fruits.length;i++)
        {
            int count=0;
            for(int j=i+1;j<fruits.length;j++)
            {
                if(fruits[i].equals(fruits[j]))
                {
                    count++;
                }
            }
            if(count>=1)
            {
                System.out.print(fruits[i]+" ");
            }
        }
    }
}
