Cars.java 
 
package Module_1; 
import java.util.Scanner; 
public class Cars { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); 
        int objs, price; 
        String name, code; 
        int lowpr = Integer.MAX_VALUE; 
        Product lowestPricedProduct = null; 
        System.out.println("Enter the number of objects:"); 
        objs = s.nextInt(); 
        for (int i = 0; i < objs; i++) { 
            s.nextLine(); 
            System.out.println("Enter the car product code:"); 
            code = s.nextLine(); 
            System.out.println("Enter the car name:"); 
            name = s.nextLine(); 
            System.out.println("Enter the car price:"); 
            price = s.nextInt(); 
            Product p = new Product(code, name, price); 
            p.display(); 
            if (price < lowpr) { 
                lowpr = price; 
                lowestPricedProduct = p; 
            } 
        } 
        if (lowestPricedProduct != null) { 
            System.out.println("\nDisplaying product with lowest value:"); 
            lowestPricedProduct.display(); 
        } 
    } 
} 
 
 
Product.java 
 
package Module_1; 
public class Product { 
    String pname, pcode; 
    int price; 
    public Product(String pname, String pcode, int price) { 
        this.pname = pname; 
        this.pcode = pcode; 
        this.price = price; 
    } 
    public void setPname(String pname) { 
        this.pname = pname; 
    } 
    public String getPname() { 
        return pname; 
    } 
    public void setPcode(String pcode) { 
        this.pcode = pcode; 
    } 
    public String getPcode() { 
        return pcode; 
    } 
    public void setPrice(int price) { 
        this.price = price; 
    } 
    public int getPrice() { 
        return price; 
    } 
    public void display() { 
        System.out.println("-------------------------------"); 
        System.out.print("Product code:" + this.pcode); 
        System.out.print("\nProduct name:" + this.pname); 
        System.out.print("\nProduct price:" + this.price + "\n"); 
        System.out.println("-------------------------------"); 
    } 
} 
