public abstract class Product {
    protected int id;
    protected double price;
    protected double discountRate;
    protected int stock;
    protected String name;
    protected Brand brand;

    public Product(int id, double price, double discountRate, int stock, String name, Brand brand){
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
    }

    public int getID(){
        return id;
    }

    public Brand getBrand(){
        return brand;
    }

    public abstract void print();
}
