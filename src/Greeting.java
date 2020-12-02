import java.util.Scanner;

public class Greeting {

    public void sayHello() {
        System.out.println("Please, enter your name:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Hello, " + s +"!");

    }
}
