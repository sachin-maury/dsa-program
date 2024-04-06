import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
//       oeration=1 : set  operation=0 :clear
        int oper = sc.nextInt();
        
        int n=5; // 0101 -> 0111=in decimal 7 / for : 1
        //for 0 /in dec=5-> 0101
        
        int pos = 1;
        int bitMask =1<<pos;
        if(oper == 1){
            // set 
           
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
             int newBitMask  = ~(bitMask);
             int newNumber =newBitMask & n;
             System.out.println(newNumber);
        }
       
        


    }
}
