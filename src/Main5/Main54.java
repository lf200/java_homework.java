package Main5;

import java.util.Scanner;


class MyPoint{
    private double x, y;
    public MyPoint(double a, double b)
    {
        x = a;
        y = b;

    }
    public void print(){
        System.out.println("Your location of horizontal (X) is :" + x);
        System.out.println("Your location of ordinate (Y) is :" + y);
    }
}


public class Main54 {
    public static void main(String[] args) {
        double x;
        double y;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the horizontal (X) :");
        x = in.nextDouble();
        System.out.println("Please input the ordinate (Y) :");
        y = in.nextDouble();
        MyPoint m = new MyPoint(x, y);
        m.print();

    }
}
