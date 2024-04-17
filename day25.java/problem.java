public class problem {
    public static void printRecursion(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
            printRecursion(n-1);
    }

    public static void main(String[] args){
        int n = 9; 
        printRecursion(n);
    }
}
