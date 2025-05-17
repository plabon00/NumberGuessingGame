

public class welcome {
    public void welcomeUser() throws InterruptedException {
        System.out.println("=====================================");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("=====================================");

        Thread.sleep(2000);

        System.out.println("- I'm thinking of a number between 1 and 100.");
        Thread.sleep(1000);
        System.out.println("- So, Lets Start....");
        Thread.sleep(500);
    }
}
