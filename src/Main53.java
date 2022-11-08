import java.util.Scanner;

class Employee{
    private String name;
    private int age;
    private double salary;
    private double bonus;
    private double income;
    public Employee(String n, int a, double s, double b)
    {
        name = n;
        age = a;
        income = s + b;
    }
    public void print()
    {
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's age: " + age);
        System.out.println("Employee's income: " + income);
    }
}

public class Main53 {
    public static void main(String[] args) {
        String name;
        int age;
        double salary, bonus;
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the employee's name: ");
        name = in.nextLine();
        System.out.println("Please input the employee's age: ");
        age = in.nextInt();
        System.out.println("Please input the employee's sarary: ");
        salary = in.nextDouble();
        System.out.println("Please input the employee's bonus: ");
        bonus = in.nextDouble();
        Employee e = new Employee(name, age, salary, bonus);
        e.print();
    }


}
