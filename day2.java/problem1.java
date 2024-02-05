import java.util.*;
public class problem1 {
    public static void update(int marks[]) {
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        
    }
    public static void main(String[] args) {
        int marks[]={48,55,56,85,45};
        update(marks);
        for(int i=0; i<marks.length;i++){
        System.out.print(marks[i]+" ");
        System.out.println();
        }
    }
}