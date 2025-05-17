import java.util.Random;
import java.util.Scanner;

public class game {
    private Random random;
    private String level;
    private Scanner sc ;
    private int loopCount ;
    public game(String x){
        random = new Random();
        sc = new Scanner(System.in) ;
        this.level = x ;
    }
    public void mainGame() throws InterruptedException {
        int rand = random.nextInt(100);

        if (level.equals("Easy")) loopCount = 10 ;
        else if(level.equals("Medium")) loopCount = 5 ;
        else if(level.equals("Hard")) loopCount = 3 ;

        for (int i = 0 ; i<=loopCount ;i++){
            if(loopCount-i == 0) {
                System.out.println();
                System.out.println("Soo Close ..... Try Again......");
                System.out.println();
                Thread.sleep(2000);
                return ;
            }
            System.out.println("Chance Left : "+ (loopCount-i));
            Thread.sleep(500);
            System.out.print("Enter Your Guess : ");
            int uInput = sc.nextInt();

            if(uInput == rand){
                System.out.println("Congratulations! You guessed the correct number in "+(i+1)+" attempts.");
                return;
            }else if(uInput > rand){
                System.out.println("Incorrect! The number is Less than "+ uInput+ ".");
            }else if(uInput < rand) {
                System.out.println("Incorrect! The number is Greater than "+ uInput+ ".");
            }

        }

    }

}
