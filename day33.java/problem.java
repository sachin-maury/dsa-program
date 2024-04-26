import java.util.*;
public class problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 =sc.nextInt();
        System.out.println("Enter your second number:");
        int num2 =sc.nextInt();
        sc.close();
        if(num1==num2)
        System.out.println("both are equal:");
        else if(num1>num2)
        System.out.println(num1+"is greater:");
        else
        System.out.println(num2+"is greater:");
        
    }
}
