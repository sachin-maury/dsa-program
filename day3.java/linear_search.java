import java.util.*;
public class linear_search {
    public static int linearsearch(int values[], int key) {
        for(int i=0; i<values.length; i++){
            if(values[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int values[]={2,4,6,8,10,12,14,16};
        int key=12;

        int index=linearsearch(values, key);
        if(index == -1){
            System.out.println("NOT FOUND:");
        }
        else{
            System.out.println("KEY IS AT A INDEX:"+index);
        }
    }
}
