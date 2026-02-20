import java.util.Scanner;

public class MaxFinder {

    
    public static int getMax(int[] array) {
        int max = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        
        System.out.println("=== Part b.i: Command Line Input ===");
        if (args.length > 0) {
            int[] cmdArray = new int[args.length];
            
            
            for (int i = 0; i < args.length; i++) {
                cmdArray[i] = Integer.parseInt(args[i]);
            }
            
            System.out.println("Command Line Maximum: " + getMax(cmdArray));
        } else {
            System.out.println("No command line arguments provided.");
        }

        
        System.out.println("\n=== Part b.ii: Scanner Input ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements do you want to enter? ");
        int size = scanner.nextInt();

        if (size > 0) {
            int[] scannerArray = new int[size];
            System.out.println("Please enter " + size + " integers:");
            
            
            for (int i = 0; i < size; i++) {
                scannerArray[i] = scanner.nextInt();
            }

            
            System.out.println("Scanner Array Maximum: " + getMax(scannerArray));
        } else {
            System.out.println("Array size must be at least 1.");
        }
        
        scanner.close();
    }
}