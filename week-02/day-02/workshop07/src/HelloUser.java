import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 21..
 */
public class HelloUser {
    public static void main(String[] args) {
        System.out.println("What is your name ?");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        System.out.println("Hello " + userInput1 + "!");
    }
}
