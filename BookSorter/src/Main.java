import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> booksName = new TreeSet<>();

        booksName.add(new Book("Anna Karenina",864,"Lev Tolstoy","01/12/1878"));
        booksName.add(new Book("Sefiller",1232,"Viktor Hugo","31/03/1862"));
        booksName.add(new Book("1984",328,"George Orwell","08/06/1949"));
        booksName.add(new Book("Monte Kristo Kontu",1276,"Alexandre Dumas ve Auguste Maquet","15/01/1846"));
        booksName.add(new Book("Kürk Mantolu Madonna",160,"Sabahattin Ali","03/02/1943"));

        int i = 1;

        for(Book order : booksName){
            System.out.println(i + ". Kitap : " + order.getName() + "  ->  (" + order.getAuthor() + ")");
            i++;
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        TreeSet<Book> booksPage = new TreeSet<>(new NumberOfPagesComparator());
        booksPage.addAll(booksName);

        Iterator<Book> itr = booksPage.iterator();

        i = 1;
        while(itr.hasNext()){
            Book o = itr.next();
            System.out.println(i + ". Kitap : " + o.getNumberOfPages() +"\t(" + o.getName() + ")");
            i++;
        }

        }
    }






