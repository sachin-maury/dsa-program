import java.util.*;

public class deleteString {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("narayan");
        System.out.println(sc);
        // now we are using delete keyword to delete the letter.
        sc.delete(1, 2);
        System.out.println(sc);
    }
    
}
