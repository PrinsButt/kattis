// Problem url: https://open.kattis.com/problems/zoo

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String line;
    
    StringBuilder output = new StringBuilder();
    int listId = 1;

    while (!(line = reader.nextLine()).equals("0")) {
      int animals = Integer.parseInt(line);

      Map<String, Integer> animalsMap = new TreeMap<String, Integer>();

      for (int animal=0; animal < animals; animal++) {
        String data = reader.nextLine().toLowerCase().trim();
        String parts[] = data.split("\\s+");
        String animalType = parts[parts.length-1];

        if (animalsMap.containsKey(animalType)) {
          animalsMap.replace(animalType, animalsMap.get(animalType) + 1);
        }
        else {
          animalsMap.put(animalType, 1);
        }
      }

      output.append("List ").append(listId).append(":\n");

      for (String key : animalsMap.keySet()) {
        output.append(key).append(" | ").append(animalsMap.get(key)).append("\n");
      }

      listId++;
    }

    reader.close();

    System.out.print(output);
  }
}