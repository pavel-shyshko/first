import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionalTask1 {
    public static void main(String[] args) {
        //Задание. Ввести n чисел с консоли.
        //1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        System.out.println("How many numbers do you want to enter?");
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please, enter your numbers:");
        int [] inputN = new int [Integer.parseInt(input)];
        for (int i =0; i < inputN.length; i++){
            try {
                inputN [i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int temp;
        int count = 1;
        int [] len = new int[inputN.length];
        for (int i = 0; i < len.length; i++) {
            temp = inputN [i];
            while ((temp / 10) != 0){
                temp = temp / 10;
                count++;
            }
            len [i] = count;
            count = 1;
        }
        int maxlenght = len [0];
        int minLenght = len [0];
        for (int i = 0; i < len.length; i++) {
            if (maxlenght > len [i]){
                maxlenght = len [i];
            }
            if (minLenght < len [i]){
                minLenght = len [i];
            }
        }
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < len.length; i++) {
            if (maxlenght == len [i]){
                indexMax = i;
            }
            if (minLenght == len [i]){
                indexMin = i;
            }
        }
        System.out.println("The shortest number is " + inputN [indexMax] + ", its length is " + maxlenght);
        System.out.println("The longest number is " + inputN [indexMin] + ", its length is " + minLenght);

        //3.     Вывести на консоль те числа, длина которых меньше (больше)
        // средней длины по всем числам, а также длину.
        int mediumLenght;
        int sumLenght = 0;
        for (int i = 0; i < len.length; i++) {
            sumLenght = sumLenght + len [i];
        }
        mediumLenght = sumLenght / len.length;
        System.out.println("Medium length is " + mediumLenght);
        for (int i = 0; i < len.length; i++) {
            if (len [i] > mediumLenght){
                System.out.println("Number " + inputN [i] + " has length " + len [i] + " and it's more than medium length");
            }
        }

        //2.     Вывести числа в порядке возрастания (убывания) значений их длины.
        for (int i = len.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (len[j] > len[j + 1]) {
                    int temp1 = len[j];
                    len[j] = len[j + 1];
                    len[j + 1] = temp1;
                    int temp2 = inputN[j];
                    inputN[j] = inputN[j + 1];
                    inputN[j + 1] = temp2;
                }
            }
        }
        for (int i = 0; i < inputN.length; i++) {
            System.out.print(inputN[i] + " ");
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
