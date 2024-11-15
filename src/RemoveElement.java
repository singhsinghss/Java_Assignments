public class RemoveElement {

    public static void main(String[] args)
    {
        char[] letters={'a','b','c','d','e'};
        char letterToRemove='c';
        removeSpecifiedElement(letters,letterToRemove);
    }

    private static void removeSpecifiedElement(char[] letters, char letterToRemove) {
      StringBuilder finalResult=new StringBuilder();
        System.out.println("An array elements after removing specified char "+"'"+letterToRemove+"'");
        for (char element : letters) {
            if (element != letterToRemove) {
                finalResult.append(element);
            }
        }
        System.out.print(finalResult.toString().toCharArray());
    }
}
