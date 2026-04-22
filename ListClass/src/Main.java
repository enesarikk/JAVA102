public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki eleman sayısı : " + liste.size());
        System.out.println("Dizinin kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki eleman sayısı : " + liste.size());
        System.out.println("Dizinin kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        liste.add(120);
        System.out.println("Dizideki eleman sayısı : " + liste.size());
        System.out.println("Dizinin kapasitesi : " + liste.getCapacity());
        System.out.println("Dizinin 5.indisteki elamanı : " + liste.get(5));
        liste.remove(5);
        System.out.println("Dizinin 5.indisteki elamanı : " + liste.get(5));
        System.out.println("Dizinin son elemanı : " + liste.get(11));
        liste.set(8, 50);
        liste.showList();
        System.out.println("Yazdığınız değerin dizideki indeksi : " + liste.indexOf(50));
        System.out.println("Yazdığınız değerin dizideki son indeksi : " + liste.lastIndexOf(50));
        //liste.clear();
        //liste.showList();
        MyList<Integer> subList = liste.sublist(0,3);
        subList.showList();
        System.out.println("Listedeki 50 değeri : " + (liste.contains(50) ? "Var." : "Yok."));
        System.out.println("Listenin durumu : " + (liste.isEmpty() ? "Boş." : "Dolu."));


    }
}