import java.util.Scanner;
class Circle
{
    private double radius;
    public Circle()
    {
        this.radius = 0;
    }
    Circle(double r )
    {
        this.radius = r;
    }
    double pai = 3.1415926;
    private double getPerimeter(){
        double l = 2*pai*radius;
        return l;
    }
    private double getArea(){
        return pai*radius*radius;
    }
    public void disp()
    {
        System.out.printf("radius=%.4f\n",radius);
        System.out.printf("perimeter=%.4f\n",getPerimeter());
        System.out.printf("area=%.4f\n",getArea());
    }

}
public class Main52{


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        Circle c = new Circle(r);
        c.disp();
    }
}

