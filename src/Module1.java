import java.io.IOException;

public class Module1 {
    public static void main(String[] args) throws IOException {
        /* Module 1. Main task. Task 1.
        Приветствовать любого пользователя при вводе его имени через командную строку.
        */
        Greeting greeting = new Greeting();
        greeting.sayHello();
        //----------------------------------------------------------------------------

        /* Module 1. Main task. Task 2.
        Отобразить в окне консоли аргументы командной строки в обратном порядке
        */
        Reverse reverse = new Reverse();
        reverse.reverseArguments();
        //----------------------------------------------------------------------------

        /* Module 1. Main task. Task 3.
        Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        */
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.printRandomNumbers();
        //-------------------------------------------------------------------------------

        /* Module 1. Main task. Task 4.
        Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
        и вывести результат на консоль.
        */
        randomNumbers.sumAndProduct();

        Month month = new Month();
        month.printMonth();



    }
}
