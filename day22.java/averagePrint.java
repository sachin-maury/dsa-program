import java.util.Scanner;

public class averagePrint {

    public static int calculateAverage(int num1 ,int num2, int num3){
        int sum = (num1+num2+num3)/2;
        return sum;
    }

    public static void main(String[] argd){
        System.out.println("Enter your number :");
        Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            int  sum =calculateAverage(num1,num2,num3);
       
        System.out.println("The sum Average of number:" + sum);
    } 
}
