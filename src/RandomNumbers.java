import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbers {
    public void printRandomNumbers() {
        System.out.println("Please, enter some numbers:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ((int) (Math.random() * 10 + 1));
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public void sumAndProduct() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int p = 1;
        ArrayList<String> arrayList = new ArrayList();
        System.out.println("Enter some numbers. After entering write \"exit\"");
        String s;
        while (!(s = br.readLine()).equals("exit")) {
            arrayList.add(s);
        }
        for (String str : arrayList) {
            sum = sum + Integer.parseInt(str);
            p = p * Integer.parseInt(str);
        }
        System.out.println("Sum of numbers = " + sum);
        System.out.println("Product of numbers = " + p);

    }

}
