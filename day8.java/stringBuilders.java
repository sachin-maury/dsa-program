import java.util.*;

public class stringBuilders {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Sachin");
        System.out.println(sb);


       sb.setCharAt(0, 'p');
       System.out.println(sb);
       sb.insert(0, '@');
       System.out.println(sb);
    }
}
