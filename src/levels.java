import javax.swing.*;
import java.util.Scanner;


public class levels {
    private int chosenLevel;
    Scanner sc = new Scanner(System.in) ;
    public String levelMethod() throws InterruptedException {
        int loop = 0 ;
        while(loop == 0) {

            System.out.println("- Please Chose Your Difficulty Level ");
            Thread.sleep(1000);
            System.out.println("> 1. Easy (10 chance)");
            Thread.sleep(500);
            System.out.println("> 2. Medium (5 chance)");
            Thread.sleep(500);
            System.out.println("> 3. Hard (3 chance)");

            System.out.print(" > ");
            chosenLevel = sc.nextInt();

            if (chosenLevel == 1) return "Easy";
            else if (chosenLevel == 2) return "Medium";
            else if (chosenLevel == 3) return "Hard";

            System.out.println("!!!! Wrong input !!!! \n> Please chose right one\n\n");
        }
        return null;
    }
}
