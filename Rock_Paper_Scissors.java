package Java_Programs;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("   -: Welcome to Rock Paper Scissors :-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.next();
        System.out.println("Enter : 1 for Rock \n        2 for Paper \n        3 for Scissors");
        Random random = new Random();
        int num = sc.nextInt();
        int pc = random.nextInt(1,4);

        // User Input
        if(num == 1) {
            System.out.println(name+ " : Rock");
        }
        else if(num == 2) {
            System.out.println(name+ " : Paper");
        }
        else if (num == 3) {
            System.out.println(name+ " : Scissors");
        }
        else{
            System.out.println("Please choose a valid option");
        }

        // System input
        if(pc == 1) {
            System.out.println("Computer : Rock");
        }
        else if(pc == 2) {
            System.out.println("Computer : Paper");
        }
        else if (pc == 3) {
            System.out.println("Computer : Scissors");
        }

        // Result
        if(num == pc){
            System.out.println("Draw");
        }
        else if(num == 1 && pc == 2){
            System.out.println("Winner : Computer");
        }
        else if(num == 1 && pc == 3){
            System.out.println("Winner : " + name);
        }
        else if(num == 2 && pc == 1){
            System.out.println("Winner : " + name);
        }
        else if(num == 2 && pc == 3){
            System.out.println("Winner : Computer");
        }
        else if(num == 3 && pc == 1){
            System.out.println("Winner : Computer");
        }
        else if(num == 3 && pc == 2){
            System.out.println("Winner : " + name);
        }
    }
}
