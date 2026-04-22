import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hoşgediniz !");
        System.out.println("Lütfen kullanıcı adınızı giriniz : ");
        //String playerName = input.nextLine();
        Player player = new Player("VaktiLaL");
        System.out.println("Oyunuma Hoşgeldin " + player.getName() + " !");
        System.out.println("Kahramınını Seç !");
        player.selectChar();

        Location location = null;
        while(true){
            player.printInfo();
            System.out.println();
            System.out.println("-----  BÖLGELER  ----- : ");
            System.out.println();
            System.out.println("1-) Güvenli Ev   -> Düşman barınamaz !");
            System.out.println("2-) Eşya Dükkanı -> Silah veya zırh alabilirsin !");
            System.out.println("3-) Mağara       -> Dikkatli ol ! Ödül <Yemek> fakat Zombiler burada !");
            System.out.println("4-) Orman        -> Dikkatli ol ! Ödül <Odun> fakat Vampirler burada !");
            System.out.println("5-) Nehir        -> Dikkatli ol ! Ödül <Su> fakat Ayılar burada !");
            System.out.println("0-) Çıkış Yap    -> Oyunu Sonlandır !");
            System.out.print("Gitmek istediğin yeri seç ! : ");
            int selectLoc = input.nextInt();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Geçerli bölge gir !");
            }

            if(location == null){
                System.out.println();
                System.out.println("#####  OYUNU ERKEN SONLANDIRDIN, KORKAK !  ####");
                break;
            }

            if(!location.onLocation()){
                System.out.println("GAME OVER !");
                break;
            }
        }
    }
}
