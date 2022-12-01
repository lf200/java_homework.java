package shiyan6;
import java.util.Scanner;
public class Text3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int count;

        System.out.println("How many students?");
        a=in.nextInt();
        if(a==0) {
            System.out.println("All the students bellow:");
            return;
        }
        String[] arr =new String[a];
        String ss;
        in.nextLine();
        System.out.println("Please input the names of students:");
        for(int i=0;i<a;i++) {
            ss=in.nextLine();
            arr[i]=ss;
        }

        System.out.println("All the students bellow:");
        for(int i=0;i<a;i++) {
            System.out.println(i+1+":"+arr[i]);
        }

    }

}
