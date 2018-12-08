// Problem url: https://open.kattis.com/problems/speedlimit

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    List<Integer> results = new ArrayList<Integer>();

    while(true) {
      int numPairs = Integer.parseInt(reader.nextLine());

      if (numPairs == -1) break;
      
      int totalMiles = 0;
      int prevTime = 0;

      for (int index=0; index < numPairs; index++) {
        String[] data = reader.nextLine().split(" ");
        int speed = Integer.parseInt(data[0]);
        int time = Integer.parseInt(data[1]);

        totalMiles += (speed * (time - prevTime));
        prevTime = time;
      }

      results.add(totalMiles);
    }

    reader.close();

    for (int result : results) {
      System.out.println(result + " miles");
    }
  }
}