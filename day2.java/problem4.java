import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        sc.close();
        if(age==18)
        System.out.println("You are eligible for voting:");
        else if(age<18)
        System.out.println("You are note eligible for voting:");
        else
        System.out.println("You are eligible for voting:");
    }
}
