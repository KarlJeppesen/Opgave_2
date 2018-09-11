/**
 * @author Gruppe 15
 * Navn og studienummer:
 * Karl Emil Jeppesen       s180557
 * Alfred Röttger Rydahl    s160107
 * Said Abdullahi           s185013
 * Søren Poulsen            s180905
 * Rasmus Sander Larsen     s185097
 * Noah F. M. Hamza         s185084
 * Dato: 11-09-2018
 * SWT/ITØ Danmarks Tekniske Universitet
 */

import java.util.Scanner; //Scanner pakken indlæses

public class FallingObject {

    FallingObject () { //Konstruktøren 'FallingObject()' laves

        System.out.println("Indtast højden i m med \".\" som separator"); //Systemet prompter brugeren

        Scanner input = new Scanner(System.in);
        String sC = input.next(); //Der scannes input som string til 'input'

        try { //try/catch tjekker om input faktisk er et tal og melder fejl (genstart) hvis ikke
            double height = Double.parseDouble(sC); //Der parses en double ud af input
            if (height <= 0) {  //Hvis højden er mindre end 0 genstartes programmet
                System.out.println("Indtast en korrekt højde.");
                FallingObject ny = new FallingObject();//programmet genstartes
            } else { //Hvis højden er okay beregnes faldtid og hastighed
                double g = 9.81; //tyngdeaccelerationen i m/s^2
                double time = (double)Math.round(Math.sqrt((2*height)/g)*100d) / 100d; //beregning af faldtid afrundet til 2 decimaler
                double speed = (double)Math.round(g*time*100d) / 100d; //beregning af hastighed afrundet til 2 decimaler
                System.out.println("Det tager " + time + " sekunder at falde "  + height + " meter."); //system output
                System.out.println("Sluthastigheden er da " + speed + " meter i sekundet."); //system output
            }
        } catch (NumberFormatException e) { //hvis input ikke er et tal følger denne prompt og genstart af programmet
            System.out.println("Indtast en korrekt højde.");
            FallingObject ny = new FallingObject(); //programmet genstartes
        }
        input.close(); //input lukkes efter kørsel
    }

    public static void main (String[] args) {

        FallingObject ny = new FallingObject(); //main funktionen kalder på konstruktøren

    }
}