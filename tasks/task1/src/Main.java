import java.sql.PreparedStatement;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void addition(int a, int b){
      int res =a+b;
        System.out.println("sum is: "+res);

    }
    public static void substraction(int a, int b){
        int res =a-b;
        System.out.println("difference is : "+res);

    }
    public static void multiplication(int a, int b){
        int res =a*b;
        System.out.println("Product is  : "+res);

    }
    public static void division(int a, int b){
        int res =0;
       if(b>0){
           res =a/b;
           System.out.println("division res is  : "+res);
       }else{
           System.err.println("You cant divide a number by 0");
       }


    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter First Number");
         int n1=sc.nextInt();
        System.out.println("Enter Second Number");
        int n2=sc.nextInt();

        System.out.println("For Addition press 1");
        System.out.println("For Substraction press 2");
        System.out.println("For Multiplication press 3");
        System.out.println("For Division press 4");
        System.out.println("What Operation do you want to perform?");
        int ch=sc.nextInt();

        switch (ch){
            case 1:
                addition(n1,n2);
                break;
            case 2:
                substraction(n1,n2);
                break;
            case 3:

                multiplication(n1,n2);
                break;
            case 4:
                    division(n1,n2);
                break;
            default:
                System.out.println("Enter correct choice");

        }


    }
}