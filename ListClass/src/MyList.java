public class MyList<T> {
    private static final int MULTIPLIER_CONSTANT = 2;
    private T[] arr;
    private int size;
    private int capacity;

    public MyList() {
        this.size = 0;
        this.capacity = 10;
        this.arr = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data) {
        if (this.size == this.capacity) {
            this.capacity *= MULTIPLIER_CONSTANT;
            System.out.println("Yetersiz kapasite nedeniyle dizi kapasitesi iki katına çıkarıldı! Yeni kapasite : " + this.capacity);
            T[] newArray = (T[]) new Object[this.capacity];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.arr[i];
            }
            this.arr = newArray;
        }
        this.arr[size++] = data;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) return null;
        return this.arr[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= this.size) return null;

        T removed = this.arr[index];

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        this.arr[this.size - 1] = null;
        this.size--;

        return removed;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= this.size) return null;

        return this.arr[index] = data;
    }

    public void showList() {
        if (this.size == 0) {
            System.out.println("[ ]");
        }

        for (T value : this.arr) {
            if (value != null) {
                System.out.print(value + ", ");
            }
        }
        System.out.println();
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.size; i++) {
            if ((data == null && this.arr[i] == null) || (data != null && data.equals(this.arr[i]))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = this.size - 1; i >= 0; i--) {
            if ((data == null && this.arr[i] == null) || (data != null && data.equals(this.arr[i]))) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public T[] toArray(){
        T[] newArray = (T[]) new Object[this.size];
        for(int i = 0; i < this.size; i++){
            newArray[i] = this.arr[i];
        }
        return newArray;
    }

    public void clear(){
        this.arr = (T[]) new Object[this.capacity];
        this.size = 0;
    }

    public MyList<T> sublist(int start, int finish){
        if(start < 0 || finish > this.size || start > finish) return null;
        MyList<T> sub = new MyList<>(finish - start);
        for(int i = start; i < finish; i++){
            sub.add(this.get(i));
        }
        return sub;
    }

    public boolean contains(T data){
        return indexOf(data) != -1;
    }

}
