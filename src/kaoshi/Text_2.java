package kaoshi;

import java.util.Scanner;

class People {
    public String name;
    public int age;

    public void show() {
        if ((age >= 0 && age < 18) || (age > 60)) {
            System.out.println(name + "\'s age is: " + age + ", ticket: free.");
        }
        if (age >= 18 && age <= 60) {
            System.out.println(name + "\'s age is: " + age + ", ticket: 20$.");
        }
        if (age < 0) {
            System.out.println(name + "\'s age not be less than 0.");
        }
    }
}
public class Text_2 {
    public static void main(String[] args) {
        People people = new People();
        System.out.println("please input name");
        Scanner in = new Scanner(System.in);
        people.name = in.nextLine();
        System.out.println("please input age");
        people.age = in.nextInt();
        in.close();
        people.show();

    }
}

