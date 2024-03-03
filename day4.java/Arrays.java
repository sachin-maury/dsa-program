import java.util.Scanner;
public class Arrays {
    public static void getLargest(int numbers[]) {
        int largest =Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest=numbers[i];
               
            }
            return largest;
        }
      
    }
    public static void main(String[] args) {
        int numbers[]={1, 2, 6, 3, 5};
        System.out.println("print largest values:" + getLargest(numbers));
    }
}
