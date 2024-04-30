import java.util.*;
public class arr2 {
    public static void update(int score[]) {
        for(int i=0; i<score.length; i++){
            score[i]=score[i]+2;
        }
        
    }
    public static void main(String[] args) {
        int score[] ={89,66,79,69,45};
        update(score);
        for(int i=0; i<score.length; i++){
            System.out.print(score[i]+" ");
            System.out.println();
        }
    }
}
