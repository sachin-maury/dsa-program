public class element {

    public static void printElementArray(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {45,70,41,32,40};
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    //swap 
                    int temp = a[j];
                    a[j] =a[j+1];
                    a[j+1] =temp;
            
                }
            }
        }
        printElementArray(a);
    }
}