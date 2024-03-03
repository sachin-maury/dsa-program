import java.util.Scanner;

public class mul {
    public static int calculateMul(int a, int b){
        int mul= a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = calculateMul(a, b);
        System.out.println("The multiple of two no is:" + mul);
    }
}
