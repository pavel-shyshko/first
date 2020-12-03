public class LinearProgramsTest {
    public static void main(String[] args) {
        LinearPrograms lp = new LinearPrograms();
        //Task1
        System.out.println(lp.functionTask1(2, 8, 1));

        //Task2
        System.out.println(lp.functionTask2(1, 2, 3));

        //Task3
        System.out.println(lp.functionTask3(30, 60));

        //Task4
        System.out.println(lp.functionTask4(123.987));

        //Task5
        lp.functionTask5(15678);

        //Task 6
        lp.functionTask6(3, 2);
        lp.functionTask6(-2, 4);
        lp.functionTask6(-4, 3);
        lp.functionTask6(0, -2);
        lp.functionTask6(-4, 4);
    }
}
