import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Add Product ");
        System.out.print("Name Product: ");
        String nameProduct = sc.nextLine();
        System.out.print("Make : ");
        String make = sc.nextLine();
        System.out.print("Price: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("Depcription: ");
        String depcription = sc.nextLine();

        product.setId_Product();
        product.setName_Product(nameProduct);
        product.setMake(make);
        product.setPrice(price);
        product.setDecription(depcription);
        System.out.print("Save in file: ");
        String path = sc.nextLine();
        try{
            Product[] array = new Product[] {product};
            save(path,array);
            System.out.println("Success!");
        }catch (Exception e){
            System.out.println("Fail");
            e.printStackTrace();
        }

        try{
            System.out.println("Your Products");
            read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void save(String path, Product[] products)throws Exception{
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(products);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            oos.close();
        }
    }
    public static void read()throws Exception{
        ObjectInputStream ois = null;
        //ArrayList<Product> products = new ArrayList<>();
        Product[] products = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("file.dat"));
              products = (Product[])ois.readObject();
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i].toString());
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ois.close();
        }
    }
    public static void input(){

    }
}
