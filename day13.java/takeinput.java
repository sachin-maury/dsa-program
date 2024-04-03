import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int marks[]=new int[number];
        for(int i=0; i<number;i++){
            marks [i]=sc.nextInt(); 
           
        }
        System.out.println("your final output:");
        for(int i =0; i<number; i++){
            System.out.println(marks[i]);
        }
        
       

    }
}
