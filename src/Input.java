import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("May I know your name please!");
        System.out.print("Enter your name: ");
        String name = sn.nextLine();
        System.out.println("How old are you?");
        System.out.print("Enter your age: ");
        int age = sn.nextInt();

        System.out.println("Your name is "+name );
        System.out.println("Your age is "+age);
        System.out.println("Thanks for the information.");



    }
}
