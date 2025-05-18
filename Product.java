import java.util.Scanner;

class Product {
    // Data members
    int pcode;
    String pname;
    double price;

    // Constructor
    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Code: " + pcode + ", Name: " + pname + ", Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array to hold 3 products
        Product[] products = new Product[3];

        // Input product details from user
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product Code: ");
            int code = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Product Price: ");
            double price = sc.nextDouble();

            // Create product object and store it in array
            products[i] = new Product(code, name, price);
        }

        // Find the product with the lowest price
        Product lowest = products[0];

        for (int i = 1; i < 3; i++) {
            if (products[i].price < lowest.price) {
                lowest = products[i];
            }
        }

        System.out.println("\nProduct with the lowest price:");
        lowest.display();

        sc.close();
    }
}
