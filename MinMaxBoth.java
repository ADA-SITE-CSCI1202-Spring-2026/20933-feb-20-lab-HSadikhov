public class MinMaxBoth {

    
    public static int[] getMinAndMax(int[] array) {
        
        int min = array[0];
        int max = array[0];
        
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; 
            }
            if (array[i] > max) {
                max = array[i]; 
            }
        }
        
        
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        
        int[] myNumbers = {15, 42, 8, 99, 23, 4};
        
        int[] results = getMinAndMax(myNumbers);
        
        System.out.println("The minimum is: " + results[0]);
        System.out.println("The maximum is: " + results[1]);
    }
}