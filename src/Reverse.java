import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public void reverseArguments(){
        System.out.println("Enter some phrase");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String [] str = s.split(" ");
        for (int i = 0; i < str.length; i++){
            System.out.print(str[str.length -1 - i] + " ");
        }
        System.out.println();
    }
}
