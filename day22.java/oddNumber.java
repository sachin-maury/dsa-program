import java.util.Scanner;

public class oddNumber {

 public static int printNumber(int number){
   
    for(int i=0; i<number; i++){
        if(i%2!=0){
            System.out.println("This is odd number:" + i);
        }
      
    }
    return number;
 }

    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();

        printNumber(number);


    }

}
