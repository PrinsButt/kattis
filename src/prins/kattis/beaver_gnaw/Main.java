package prins.kattis.beaver_gnaw;

// Problem url: https://open.kattis.com/problems/beavergnaw
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = "";

        StringBuilder output = new StringBuilder();

        while (!(line = reader.nextLine()).equals("0 0")) {
            String parts[] = line.split(" ");
            double diameter = Double.parseDouble(parts[0]);
            double chomped = Double.parseDouble(parts[1]);

            double volume = Math.PI * Math.pow(diameter / 2, 2) * diameter;
            double remaining = volume - chomped;

            // volume of a frustum is:
            //  πh/3 (R2 + Rr + r2)
            // which after substitution is:
            // (Math.PI * ((diameter - d)/2))/3 * ( Math.pow(diameter,2)/4 + (diameter/2 * d/2) Math.pow(d,2)/4)
            // which after reduction is:
            // Math.PI/6 * (diameter - d) *  (Math.pow(diameter,2)/4 + (diameter * d)/4 + Math.pow(d,2)/4)
            // Math.PI/24 * (Math.pow(diameter, 3) - Math.pow(d,3))
            // volume of 2 frustums after reducing equations is:
            // Math.PI/12 * (Math.pow(diameter, 3) - Math.pow(d,3))
            // volume of small cylinder after reducing equation is:
            // Math.PI/4 * Math.pow(d, 3)
            // thus, volume of frustums + cylinder after reducing equation is:
            // Math.PI/12 * (Math.pow(diameter, 3) + (2 * Math.pow(d, 3)))
            // Rearraing for d gives:
            double d = Math.cbrt(((6 * remaining) / Math.PI) - (Math.pow(diameter, 3) / 2));

            output.append(d).append("\n");

        }

        reader.close();

        System.out.print(output);
    }
}
