import java.util.Scanner;

public class jump2 {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            if(i==5){
                continue;
            }
            if(i==8){
                break;
            }
            System.out.println(i);
           
        }

    }
}
