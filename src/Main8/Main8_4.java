package Main8;
import java.util.Scanner;
public class Main8_4 {
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int times = sc.nextInt();
            double price = sc.nextDouble();

            double pay2 = 0;

            MobilePhone1 phone1 = new MobilePhone1("13899999999",times, price);

            try
            {
                pay2=phone1.pay();
            }
            catch(PayException e)
            {
                System.out.println("Exception is" + e);
            }
            System.out.println("Fee=" + pay2);

        }
    }

    abstract class Phone1
    {
        private String code;
        public Phone1(String code)
        {
            this.code = code;
        }
        public abstract void display();
    }


    interface PayAble
    {
        public double pay() throws PayException; //计算电话话费
    }


    class MobilePhone1 extends Phone1 implements PayAble
//在手机类定义中增加计算话费异常，若果话费小于0则抛出异常
//1、自定义一个异常类，表示话费小于0的异常
//2、计算话费时如果小于0则抛出异常，在测试类中处理异常
    {
        private int time;
        private double price;

        public MobilePhone1(String code, int time, double price)
        {
            super(code);
            this.time = time;
            this.price = price;
        }


        public double pay() throws PayException
        {
            double p;
            p = time * price;
            if(p <= 0)
            {
                throw new PayException("Fee is 0!");
            }
            return p;
        }


        public void display()
        {

        }
    }


    class PayException extends Exception
    {
        private String message;
        public PayException(String exp)
        {
            message = exp;
        }

        @Override
        public String toString()
        {
            return "PayException:" + message;
        }
    }


