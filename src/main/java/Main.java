import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        codechallenge5 ();
//        difference ();
        guessingGame();
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//
//        switch (num){
//            case 1:
//                System.out.println("You entered one");
//                break;
//            case 2:
//                System.out.println("You entered two");
//                break;
//
//                default:
//                    System.out.println("Invalid number");
//                    break;
//        }

    }
    public static void codechallenge5 (){
        int x = 2;
        int y = 4;
        if(x>y){
            System.out.format("%d is bigger than %d", x, y);
        }else{
            System.out.format("%d is smaller than %d", x,y);
        }

    }
    public static void difference (){
        int x = 2;
        int y = 4;

        System.out.format("\nThe difference between x and y is %d", x-y);
    }

    public static void guessingGame(){
        int chances = 0;
        double randomNum = Math.ceil(Math.random()*(5-1))+1;
        System.out.println((int)randomNum);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1-5: ");
        double userGuess = scanner.nextDouble();

        chances ++;
        if(userGuess != (int)randomNum){
            if(chances != 2){
                System.out.println("Hard luck, try again");
                System.out.print("Guess a number between 1-5: ");
                userGuess = scanner.nextDouble();
                if(userGuess == (int)randomNum){
                    System.out.println("Correct! Aren't you lucky!");
                    chances ++;
                }else{
                    System.out.println("Out of chances, thanks for playing");
                }
            }

        }else {
            System.out.println("Correct! Aren't you lucky!");
        }

    }
}
