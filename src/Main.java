import java.lang.Math;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean cont = false;
        String contYN;
        String word;
        int random;

        System.out.println("Enter a word or phrase:");
        word = scan.nextLine();

        if (word.length() > 1) {
            do {
                random = (int)(Math.random()*word.length());
                word = word.substring(0,random) + word.substring(random +1);
                System.out.println("Your new word/phrase is: " + word);
                if (word.length() > 1) {
                    System.out.println("Again?");
                    contYN = scan.nextLine();
                    if (contYN.equalsIgnoreCase("N")){
                        cont = true;
                    }
                } else {
                    System.out.println("Your word/phrase can't be smaller.");
                    cont = true;
                }
            } while (!cont);
        } else {
            System.out.println("Your word/phrase is too small to continue.");
        }
    }
}