package shiyan6;
import java.util.Scanner;
public class Text1 {
    public static void main(String[] args) {
        System.out.println("Please input your score");
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if (score >= 0 && score <= 100) {
            System.out.println("Your score is:" + score);
        } else {
            System.out.println("Error,score should be in 0-100.");
        }
    }
}
