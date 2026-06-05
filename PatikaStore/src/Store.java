import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Store {
    private static TreeSet<Brand> brands = new TreeSet<>();
    private static List<Product> products = new ArrayList<>();
    static String line = "-".repeat(150);

    static {
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huawei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"ASUS"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));
    }

    public static void listBrands(){


        System.out.println("~~~ MARKALAR ~~~");
        System.out.println(line);

        System.out.printf("|%-3s| |%-10s|%n", "ID", "Markalar");

        System.out.println(line);

        for(Brand br : brands){
            System.out.printf("|%-3d| |%-10s|", br.getID(), br.getName());
            System.out.println();
        }

        System.out.println(line);
        }

    public static Brand findBrand(String name){
        for(Brand br : brands){
            if(br.getName().equalsIgnoreCase(name)) return br;
        }
        return null;
    }

    public static void addProduct(Product pr){
        products.add(pr);
    }

    public static void deleteProduct(int id){
        products.removeIf(p -> p.getID() == id);
    }

    public static void listProduct(){
        System.out.println("~~~ ÜRÜNLER ~~~");
        System.out.println(line);
        System.out.printf("|%-3s| |%-20s|%n", "ID", "Markalar");
        System.out.println(line);
        for(Product pr : products){
            pr.print();
        }
        System.out.println(line);
    }

    public static void filterByID(int id){
        for(Product pr : products){
            if(pr.getID() == id){
                pr.print();
            }
        }
    }

    public static void filterByBrand(String brandName){
        for(Product pr : products){
            if(pr.getBrand().getName().equalsIgnoreCase(brandName)){
                pr.print();
            }
        }
    }
}

