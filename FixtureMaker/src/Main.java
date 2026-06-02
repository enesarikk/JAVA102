import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void generateFixture(List<String> teams){

        if(teams.size() % 2 != 0){
            teams.add("PASS");
        }

        int teamCount = teams.size();
        int week = teamCount - 1;
        int weeklyMatch = teamCount / 2;

        List<String> teamList = new ArrayList<>(teams);

        System.out.println("-------- FIRST MATCHES -------");

        List<List<String[]>> firstHalf = new ArrayList<>();

        for(int i = 0; i < week; i++){
            System.out.println("\n" + (i+1) + ". WEEK ");
            List<String[]> weeklyMatches = new ArrayList<>();

            for(int k = 0; k < weeklyMatch; k++){
                String home = teamList.get(k);
                String away = teamList.get(teamCount - 1 - k);
                System.out.println(home + " VS " + away);
                weeklyMatches.add(new String[] {home, away});
            }

            firstHalf.add(weeklyMatches);

            String lastTeam = teamList.remove(teamCount - 1);
            teamList.add(1, lastTeam);
        }

        System.out.println("\n -------- SECOND MATCHES -------");

        int weeks = week + 1;

        for(List<String[]> roundMatches : firstHalf){
            System.out.println("\n" + weeks++ +". Hafta");

            for(String[] match : roundMatches){
                System.out.println(match[1] + " VS " + match[0]);
            }
        }
    }

    public static void main(String[] args) {
        List<String> teams = new ArrayList<>(Arrays.asList(
                "Galatasaray",
                "Fenerbahçe",
                "Beşiktaş",
                "Trabzonspor",
                "Başakşehir",
                "Bursaspor",
                "Denizlispor"
        ));

        Collections.shuffle(teams);
        generateFixture(teams);
        }
    }
