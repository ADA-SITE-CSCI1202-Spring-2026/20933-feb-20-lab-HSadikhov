import java.util.Scanner;

public class InvoiceArrayTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("How many invoices do you want to create? ");
        int numInvoices = scanner.nextInt();
        scanner.nextLine(); 

        
        Invoice[] invoices = new Invoice[numInvoices];

        
        for (int i = 0; i < numInvoices; i++) {
            System.out.println("\n--- Entering details for Invoice " + (i + 1) + " ---");

            System.out.print("Enter Part Number: ");
            String partNum = scanner.nextLine();

            System.out.print("Enter Part Description: ");
            String description = scanner.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Enter Price Per Item: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            
            invoices[i] = new Invoice(partNum, description, quantity, price);
        }

        
        System.out.println("\n=== Invoice Summary ===");
        for (int i = 0; i < invoices.length; i++) {
            System.out.println("Invoice " + (i + 1) + " Total Amount: $" + invoices[i].getInvoiceAmount());
            
            
            System.out.println("  Details -> " + invoices[i].toString());
        }

        scanner.close();
    }
}