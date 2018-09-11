import java.util.Scanner;

public class FallingObject {

    FallingObject () {

        System.out.println("Indtast højden i m med \".\" som separator");

        Scanner input = new Scanner(System.in);
        String sC = input.next();

        try {
            double height = Double.parseDouble(sC);
            if (height <= 0) {
                System.out.println("Indtast en korrekt højde.");
                FallingObject ny = new FallingObject();
            } else {
                double g = 9.81;
                double time = (double)Math.round(Math.sqrt((2*height)/g)*1000d) / 1000d;
                System.out.println("Det tager " + time + " sekunder at falde "  + height + " meter.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Indtast en korrekt højde.");
            FallingObject ny = new FallingObject();
        }

        input.close();
    }

    public static void main (String[] args) {

        FallingObject ny = new FallingObject();

    }

}