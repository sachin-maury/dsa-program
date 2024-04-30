import java.util.Arrays;
public class sortingString {
    public static void main(String[] args) {
        String string[] ={"banana", "apple", "mango", "grap", "cumcumber", "papaya"};
        Arrays.sort(string);
        System.out.println("Sorted String ");
        for(String str :string){
            System.out.println(str);
        }

    }
}
