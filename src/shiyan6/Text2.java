package shiyan6;
import java.util.Scanner;
public class Text2 {
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please input first number: ");
            int firstnum = in.nextInt();
            System.out.println("Please input second number: ");
            int secondnum = in.nextInt();
            if(secondnum == 0)
            {
                System.out.println("The divisor, 0,could not be zero!");
            }
            else if(secondnum < 0)
            {
                System.out.println("The divisor, "+ secondnum +", could not be negative!");
            }
            else
            {
                System.out.println("Divisor is : " +(double)firstnum/secondnum);
            }
        }
        finally
        {
            System.out.println("finally!");
        }
    }
}
