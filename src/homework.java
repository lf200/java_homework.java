import java.util.*;
public class homework {
    public static int sushu(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;

            }
        }
        return 1;
    }

    public static void lll() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean flag = true;
        if (a == 0) {
            flag = false;
        }
        while (flag) {
            int i = sushu(a);
            if (i == 0) {
                System.out.println(a + " is not sushu.");
            } else {
                System.out.println(a + " is sushu.");
            }
            a = in.nextInt();
            flag = true;
            if (a == 0) {
                flag = false;
            }
        }
        System.out.println("programe is over.");
    }


    public static void ok() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max + " " + min);
    }

    public static int my(int n, int m) {
        int x = 1;
        for (int i = n; i >= n - m + 1; i--) {
            x *= i;
        }
        int y = 1;
        for (int i = 1; i <= m; i++) {
            y *= i;
        }
        return x / y;
    }

    public static void ls() {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for (int o = 0; o <= row; o++) {
            for (int i = 0; i < (row - o) * 2; i++) {
                System.out.printf(" ");
            }
            for (int j = 0; j <= o; j++) {
                System.out.printf("%4d", my(o, j));
            }
            System.out.println("");
        }
    }

    public static int jiecheng(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void ma() {
        System.out.println("Please input a number:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int x = jiecheng(i);
            sum += x;
        }
        System.out.println("1+2!+3!+...+n!= " + sum);
    }


    public static void ok(int a) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] num = countLetters(s.toLowerCase());
        for (int i = 0; i < 26; i++) {
            if (num[i] != 0) {
                System.out.println("(" + (char) ('A' + i) + ")" + "Num=" + num[i]);
            }
        }
    }

    public static int[] countLetters(String s) {
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                num[s.charAt(i) - 'a']++;
            }
        }
        return num;
    }

    public static void a() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a sentence:");
        String a = in.nextLine();
        char b[] = a.toCharArray();
        int letter = 0;
        int blank = 0;
        int num = 0;
        int other = 0;
        int i = 0;
        while (i < b.length) {
            if (Character.isLetter(b[i])) {
                letter++;
            } else if (Character.isSpaceChar(b[i])) {
                blank++;
            } else if (Character.isDigit(b[i])) {
                num++;
            } else {
                other++;
            }
            i++;
        }
        System.out.println("The number of numbers is: " + num);
        System.out.println("The number of English letters is: " + letter);
        System.out.println("The number of blank space is: " + blank);
        System.out.println("The number of other characters is: " + other);

    }

    public static void go(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input 10 numbers:");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Your numbers are:");
        print(a, 10);
        System.out.println("Please input m:");
        int m = in.nextInt();
        System.out.println("The new numbers are:");
        move(a, m);
    }

    public static void print(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public static void move(int[] a, int m) {
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            int j = (i + m) % 10;
            b[j] = a[i];
        }
        print(b, 10);
    }

    public static void l(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for (int i = m; i <= n; i++) {
            if (g(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean g(int n) {
        int sum = 0;
        int i = n;
        int s = n;
        for (; i > 0; i /= 10) {
            sum = sum * 10 + i % 10;
        }
        if (s == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.next();
        int m = in.nextInt();
        while (m > 0) {
            int i = 0;
            while (i < ss.length() - 1 && ss.charAt(i) <= ss.charAt(i + 1)) {
                i++;
            }
            ss = ss.substring(0, i) + ss.substring(i + 1);
            m--;
        }
        System.out.println(ss);
    }
}






