package zadanie14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ScoreMain {
    public static void main(String[] args) {
        List<Score> scores = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/zadanie14/newFile.csv"));
            String line = reader.readLine();
            while (line != null) {

               String[] split= line.split(",");
               Score score = new Score(split[0],split[1],split[2]);
                System.out.println(line);
                scores.add(score);
                line = reader.readLine();


            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(scores);
        List<Score> sortedMinScore = scores.stream()
                .sorted(Comparator.comparing(score -> score.getTimestamp()))
                .collect(Collectors.toList());
        List<Score> sortedMaxScore = scores.stream()
                .sorted(Comparator.comparing(Score::getTimestamp).reversed())
                .collect(Collectors.toList());
        List<Score> tenNewresults = scores.stream()
                .sorted(Comparator.comparing(Score::getTimestamp))
                .limit(10)
                .collect(Collectors.toList());

//        System.out.println(sortedMaxScore);
//        System.out.println(sortedMinScore);
       Map<String,Integer> winnersMap =  calculateWinners(scores);
        System.out.println(winnersMap);
       String bestWinner =  getWinner(winnersMap);
        System.out.println(bestWinner);



    }
    public static Map<String, Integer> calculateWinners(List<Score> list){
        Map<String,Integer> map = new HashMap<>();
        list.forEach(score -> {
            String winnerName = score.getWinner();
            if(map.containsKey(winnerName)){
                int x =map.get(winnerName);
                x++;
                map.put(winnerName,x);
            }
            else {
                map.put(winnerName,1);
            }

        });
        return map;
    }
    public static String getWinner(Map<String,Integer> map){
        int x = 0;
        String playerName = null;
        for (String s : map.keySet()){
            int winnerCounter = map.get(s);
            if(winnerCounter>x){
                playerName = s;
                x=winnerCounter;
            }
        }
        return playerName;
    }
}
