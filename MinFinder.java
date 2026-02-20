public class MinFinder {
    
    public static int getMin(int[] array) {
        int min = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    
    public static void main(String[] args) {
        
        int[] myNumbers = {5, 12, 3, 8, 1}; 
        
        int smallest = getMin(myNumbers); 
        
        System.out.println("The smallest number is: " + smallest); 
    }
}