import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in) ;
        welcome wc = new welcome();
        levels lev = new levels();
        int want_play = 0; // 0 = Yes | 1 = NO ;
        wc.welcomeUser();

        while (want_play == 0) {

            String selectedLev = lev.levelMethod();
            game game = new game(selectedLev);
            System.out.println("> Great! You have selected the "+ selectedLev+" difficulty level.");
            Thread.sleep(1000);
            System.out.println("Best of Luck");
            Thread.sleep(500);
            System.out.println("Let's Start ......");
            Thread.sleep(500);

            game.mainGame();

            System.out.println("Want to Play Again ?\n> 1. Yes \n> 2. No\n > ");
            int dicision = sc.nextInt() ;
            if (dicision == 2) return;
            else if(dicision>2 || dicision <1){
                System.out.println("!!!!! Wrong input !!!!!");
            }


        }
    }

}