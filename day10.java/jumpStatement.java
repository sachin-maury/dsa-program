import java.util.Scanner;

public class jumpStatement {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1; i<n; i++){

        if(i==5){
            break;
        }
        System.out.println(i);
       }

       }
    
    }      

