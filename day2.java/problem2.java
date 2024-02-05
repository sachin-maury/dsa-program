import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your first number:");
          int num1=sc.nextInt();
          System.out.println("Enter your second number:");
          int num2=sc.nextInt();
          System.out.println("Enter your third number");
          int num3=sc.nextInt();
          sc.close();
          System.out.println("the average total three numbers:"+(num1+num2+num3)/3);
     
    }
    
}
