import java.util.*;
public class harray {
    public static int getLargest(int numbers[]){
      int largest=Integer.MIN_VALUE;
      for(int i=0;i<numbers.length;i++){
         if(largest<numbers[i]){
            largest=numbers[i];
            return largest;
         }
      }
      return largest;
    }
 
    public static void main(String[] args) {
       int numbers[]={5, 8 ,5 ,9 ,2 ,3};
       System.out.println("Largest values is:" + getLargest(numbers));
    }
}
