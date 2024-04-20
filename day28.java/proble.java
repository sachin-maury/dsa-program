import java.util.*;
public class proble {
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return; // in middle loop we want to end then we are use return
        }

        int factorial=1;

        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return; //we are writing to loop is end here
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);

    }
}
