import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int a = random.nextInt(1,4);

        System.out.println("Enter:");
        String b = sc.nextLine();
        int c=0;
        switch (a){
            case 1 -> System.out.println("System generated Rock");
            case 2 -> System.out.println("System generated Paper");
            case 3 -> System.out.println("System generated Scissor");
        }
        switch (b.toLowerCase()){
            case "rock" -> c =1;
            case "paper" -> c =2;
            case "scissor" -> c=3;
        }
        if((a==1 && c==1) | (a==2 && c==2) | (a==3 && c==3)){
            System.out.println("TIE");
        } else if ((c==1 && a==3)|(c==2 && a==1)|(c==3 && a==2)) {
            System.out.println("WIN");

        }
        else {
            System.out.println("LOST");
        }


    }
}
