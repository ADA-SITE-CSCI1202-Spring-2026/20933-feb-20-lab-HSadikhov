public class ReverseA {

    public static void main(String[] args) {
        
        String original = "Hello World";
        StringBuilder reversed = new StringBuilder();
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed.append(original.charAt(i));
        }

        System.out.println("Part A - Original: " + original);
        System.out.println("Part A - Reversed: " + reversed.toString());
    }
}