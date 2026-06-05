public class Phone extends Product {
    private int memory;
    private double screenSize;
    private int battery;
    private int ram;
    private String color;

    public Phone(int id, double price, double discountRate, int stock, String name, Brand brand, int memory, double screenSize, int battery, int ram, String color){
        super(id, price, discountRate, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }


    @Override
    public void print() {
        System.out.format("|%-3d| |%-20s| |%-10s| |%-10.2f| |%-5d| |%-15d| |%-10d| |%-10s%n",
                id,
                name,
                brand.getName(),
                price,
                ram,
                memory,
                battery,
                color
        );

    }
}
