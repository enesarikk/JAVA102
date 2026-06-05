import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Store.addProduct(new Phone(1,25000,10,20,"Galaxy S24",Store.findBrand("Samsung"), 256,6.2,5000,8,"Siyah"));
        Store.addProduct(new Phone(2,65000,3,18,"17T Pro",Store.findBrand("Xiaomi"),1024,6.83,7000,12,"Koyu Mor"));
        Store.addProduct(new Phone(3,120000,0,100,"17 Pro",Store.findBrand("Apple"),1024,6.9,6000,24,"Turuncu"));
        Store.addProduct(new Notebook(11,35000,15,5,"ThinkPad",Store.findBrand("Lenovo"),16,"512 SSD",15.6));
        Store.addProduct(new Notebook(12,130000,0,10,"Tulpar T7 V26.2.13",Store.findBrand("Monster"),64,"2 TB SSD",17.3));

        while(true){
            System.out.println("----- PATIKA STORE -----");
            System.out.println("""
                    1-) Markaları Listele
                    2-) Ürünleri Listele
                    3-) Ürün Ekle
                    4-) Ürün Sil
                    5-) Marka Filtrele
                    6-) ID Filtrele
                    0-) ÇIKIŞ""");

            System.out.print("Seçimim : ");
            int select = input.nextInt();
            System.out.println();

            switch (select){
                case 1:
                    Store.listBrands();
                    break;
                case 2:
                    Store.listProduct();
                    break;
                case 3:
                    addProductMenu();
                    break;
                case 4:
                    System.out.print("Silinecek ID : ");
                    int id = input.nextInt();

                    Store.deleteProduct(id);
                    break;
                case 5:
                    System.out.print("Marka : ");
                    String brand = input.next();

                    Store.filterByBrand(brand);
                    break;
                case 6:
                    System.out.print("ID : ");
                    int filterId = input.nextInt();

                    Store.filterByID(filterId);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("!!!!!  Geçerli bir seçim yapınız !!!!!");
                    break;
            }
        }
    }

    private static void addProductMenu(){
        System.out.println("""
               1-) Telefon
               2-) Notebook
                """);
        System.out.print("Seçiminiz : ");
        int type = input.nextInt();

        System.out.print("ID : ");
        int id = input.nextInt();

        System.out.print("Ürün Adı : ");
        String name = input.next();

        System.out.print("Ürün Fiyatı : ");
        double price = input.nextDouble();

        System.out.print("Ürün Markası : ");
        String brandName = input.next();

        Brand brand = Store.findBrand(brandName);

        if(brand == null){
            System.out.println("Marka bulunamadı !");
            return;
        }

        if(type == 1){
            Store.addProduct(new Phone(id,price,0,10,name,brand,128,6.1,4000,8,"Siyah"));
        } else {
            Store.addProduct(new Notebook(id,price,0,5,name,brand,16,"512 SSD",15.6));
        }
    }
}