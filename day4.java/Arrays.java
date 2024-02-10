import java.util.Scanner;
public class Arrays {
    public static void getlargest(int values[]) {
        int largest =Integer.MIN_VALUE;
        for(int i=0; i<values.length; i++){
            if(largest < values[i]){
                largest=values[i];
            }
           
        }
         
    }
    public static void main(String[] args) {
        int values[]={1, 2, 6, 3, 5};
        System.out.println("print largest values:" +getlargest(values[i] ));

    }
}
