import java.util.Scanner;

public class multiplys{
    public static void main(String[] args){
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int table;

            for(int i=1; i<11; i++){
                table = (n*i);
            
            System.out.println(table);
        }
       
    }
}