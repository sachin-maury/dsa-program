import java.util.Scanner;

public class mulTwoNo {

    public static int multiplyNo(int a , int b){
        int mul = a*b;
        return mul;

    }
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();
        int mul =multiplyNo(a, b);
        System.out.println("Multiply of Two numbers  :" + mul);
    }
}
