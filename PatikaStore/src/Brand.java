public class Brand implements Comparable<Brand>{
    private int id;
    private String name;

    public Brand(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getID(){
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Brand o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return id + " - " + name;
    }
}
