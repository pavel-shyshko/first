public class LinearPrograms {
    //1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
    private int a;
    private int b;
    private int c;
    private int z;
    public int functionTask1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = ((a - 3) * b / 2) + c;
        return z;
    }

    //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    private double a1;
    private double b1;
    private double c1;
    private double z1;
    public double functionTask2(double a1, double b1, double c1) {
        this.a1 = a;
        this.b1 = b;
        this.c1 = c;
        z1 = (b1 + Math.sqrt(Math.pow(b1, 2) + 4 * a1 * c1)) / (2 * a1) - Math.pow(a1, 3) * c + Math.pow(b1, -2);
        return z1;
    }

    //3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    private double x;
    private double y;
    private double z2;
    public double functionTask3(double x, double y) {
        this.x = x;
        this.y = y;
        double xInRadian = x * Math.PI / 180;
        double yInRadian = y * Math.PI / 180;
        z2 = ((Math.sin(xInRadian) + Math.cos(yInRadian)) / (Math.cos(xInRadian) - Math.cos(yInRadian))) * Math.tan(xInRadian * yInRadian);
        return z2;
    }

    /*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
    Поменять местами дробную и целую части числа и вывести полученное значение числа.*/
    private double realNumber;
    private double invertNumber;
    public double functionTask4(double realNumber) {
        this.realNumber = realNumber;
        invertNumber = realNumber * 1000 % 1000 + (int) realNumber * 0.001;
        return invertNumber;
    }

    /*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc.*/
    int s;
    public void functionTask5(int s) {
        this.s = s;
        int minutes;
        int hours;
        int seconds;
        hours = s / 3600;
        int rest = s - (hours * 3600);
        minutes = rest / 60;
        seconds = rest - minutes * 60;
        System.out.println("Time in seconds: " + s);
        System.out.println("Full form of time: " + hours + " h " + minutes + " min " + seconds + " sec");
    }

    /* 6. Для данной области составить линейную программу, которая печатает true,
    если точка с координатами (х, у) принадлежит закрашенной области,
    и false — в противном случае:
     */
    int x1;
    int y1;
    public void functionTask6(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
        if ((((y1 >= 0) && (y1 <= 4)) && (Math.abs(x1) <= 2)) || (((y1 <= 0) && (y1 >= -3)) && (Math.abs(x1) <= 4))){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
