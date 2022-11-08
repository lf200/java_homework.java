import java.io.PipedReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
class Employees{
    private String name;
    private int age;
    private int level;
    public Employees(String n, int a, int l)
    {
        name = n;
        age = a;
        level = l;
    }
    public void print()
    {
        System.out.println("姓名是" + name + "年龄是" + age + "级别是" + level);
    }
}
public class daily_used {

    public static void main(String[] args) {
//        StringBuilder builder = new StringBuilder();
//        builder.append("ch");
//        builder.append("i");
//        String S =builder.toString();
//        Scanner in = new Scanner(Path.of("D:/abc.txt"), StandardCharsets.UTF_8);
//        PrintWriter out = new PrintWriter("D:/abc.txt",StandardCharsets.UTF_8);
//        loop:
//        for (int i =0;i<=100;i++)
//        {
//            System.out.println(i);
//            if (i == 10)
//            {
//                break loop;
//            }
//        }
//    }
//        BigInteger a = BigInteger.valueOf(1);
//        BigInteger b = BigInteger.valueOf(2);
//        BigInteger c = a.add(b);
//        System.out.println(c);
//        int []x = {1, 2, 3, 4};
//        for (int y : x)
//        {
//            System.out.println(y);
//        }
////
//        LocalDate date = LocalDate.now();
//        int month = date.getMonthValue();
//        int today = date.getDayOfMonth();
//
//        date = date.minusDays(today - 1);
//        DayOfWeek weekday = date.getDayOfWeek();
//        int value = weekday.getValue();
//
//        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
//        for (int i = 1;i<value;i++)
//        {
//            System.out.print("   ");
//        }
//        while (date.getMonthValue() == month)
//        {
//            System.out.printf("%3d",date.getDayOfMonth());
//            if (date.getDayOfMonth() == today)
//            {
//                System.out.print("*");
//            }
//            else {
//                System.out.print(" ");
//
//            }date = date.plusDays(1);
//            if (date.getDayOfWeek().getValue() == 1) System.out.println();
//        }
//        if (date.getDayOfWeek().getValue() != 1) System.out.println();
//    }

    }
}
