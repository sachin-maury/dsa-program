import java.util.Scanner;

public class sumOfTwoNo {
     
    public static int printNumber(int a ,int b){
        
      int sum=a+b;
    
      return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter your number:");

        Scanner sc = new Scanner(System.in);
      
        int a=sc.nextInt();

        int b=sc.nextInt();

        int sum =printNumber(a, b);

        System.out.println("Sum of Two Numbers:" + sum);

    }
}
