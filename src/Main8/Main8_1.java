package Main8;
import java.util.Scanner;
public class Main8_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();  //n为输入的小数
        Num num = new Num(n);
        System.out.print(num);
    }
}


    class Num
    {
        private String zhenshu;
        private String xiaoshu;

        public Num(String num)
        {
            String[] numSplit = num.split("\\.");
            zhenshu = numSplit[0];
            xiaoshu = numSplit[1];
        }

        private int find(int a, int b)
        {
            if (a == 0)
            {
                return b;
            }
            return find(b % a, a);
        }

        @Override
        public String toString()
        {
            int i = xiaoshu.length();
            int fenmu = 1;
            for(int j = 0 ;j<i;j++)
            {
                fenmu *=10;
            }
            int fenzi = Integer.parseInt(xiaoshu);
            while (find(fenzi, fenmu) != 1)
            {
                int gys = find(fenzi, fenmu);
                fenzi /= gys;
                fenmu /= gys;
            }
            return zhenshu + " " + fenzi + " " + fenmu;
        }
    }


