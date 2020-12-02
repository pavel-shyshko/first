import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
    public void printMonth(){
        System.out.println("Please, enter the number from 1 to 12");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        int numberOfMonth;
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        numberOfMonth = Integer.parseInt(input);
        if ((numberOfMonth < 1) || (numberOfMonth > 12)){
            System.out.println("You enter incorrect number");
        } else {
            switch (numberOfMonth){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        }
    }
}
