import java.util.Scanner;

public class arithmetic{
    public static float allOperation(float a, float b, float c){
        float finalValue = a*b+c/a-b*c;
        return finalValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float finalValue =allOperation(a, b, c);
        System.out.println("The Final value is:" +finalValue);
      
    }
}