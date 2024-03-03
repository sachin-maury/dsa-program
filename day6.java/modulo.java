import java.util.Scanner;

public class modulo {
    public static int calculatemod(int a, int b){
           int mod = a%b;
           return mod;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();
        int mod = calculatemod(a, b);
        System.out.println("The modulo is:" + mod);

    }
}
