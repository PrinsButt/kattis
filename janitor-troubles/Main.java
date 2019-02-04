// Problem url: https://open.kattis.com/problems/janitortroubles

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sideA = reader.nextInt();
    int sideB = reader.nextInt();
    int sideC = reader.nextInt();
    int sideD  = reader.nextInt();
    
    double semiPerimeter = (sideA + sideB + sideC + sideD) / 2.0; 

    double answer = Math.sqrt((semiPerimeter - sideA) * 
                              (semiPerimeter - sideB) * 
                              (semiPerimeter - sideC) * 
                              (semiPerimeter - sideD)); 

    reader.close();
    System.out.print(answer);
  }
}