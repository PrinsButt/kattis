// Problem url: https://open.kattis.com/problems/icpcawards

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int teams = Integer.parseInt(reader.nextLine());

    Map<String, String> teamsMap = new LinkedHashMap<String, String>();

    for (int team=1; team <= teams; team++) {
      String details[] = reader.nextLine().split(" ");
      
      if (!teamsMap.containsKey(details[0])) {
        teamsMap.put(details[0], details[1]);
      }
    }

    int outputted = 0;

    for (String key : teamsMap.keySet()) {
      System.out.println(key + " " + teamsMap.get(key));
      outputted++;

      if (outputted == 12) break;
    }

    reader.close();
  }
}