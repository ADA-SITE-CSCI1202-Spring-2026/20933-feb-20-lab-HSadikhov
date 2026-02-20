public class ReverseB {

    
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        
        String testString1 = "Push to github";
        String testString2 = "Football";
        
        
        System.out.println("Part B - Test 1: " + reverseString(testString1));
        System.out.println("Part B - Test 2: " + reverseString(testString2));
    }
}