import java.util.Scanner;

public class factrialPrint {

    public static void printFcatorial(int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter Your Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFcatorial(n);
    }
}
