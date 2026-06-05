public class Notebook extends Product{
    private int ram;
    private String storage;
    private double screenSize;

    public Notebook(int id, double price, double discountRate, int stock, String name, Brand brand, int ram, String storage, double screenSize){
        super(id, price, discountRate, stock, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public void print() {
        System.out.format("|%-3d| |%-20s| |%-10s| |%-10.2f| |%-5d| |%-15s| |%-10.1f%n",
                id,
                name,
                brand.getName(),
                price,
                ram,
                storage,
                screenSize
        );
    }
}
