import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void prime(int a, int b){
int res =0;
        if(b%2 == 0 && a %2 ==0){
            System.out.println("invalid input");
        }else{
         String str1 = Integer.toString(a);
            String str2 = Integer.toString(b);
            int n1= str1.length();
            int n2 = str2.length();

         for(int i=0;i<str1.length();i++){
              res = str2.charAt(n2-1) - str1.charAt(n1-1);
         }

        }
        System.out.println(res);

    }

    public static void main(String[] args) {
     int a =1033;
      int b=8179;
        prime(a, b);

    }

}