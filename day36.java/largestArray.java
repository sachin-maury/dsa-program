public class largestArray {
    public static int printLargestArray(int a[] ,int total){
        int temp;
        for(int i=0; i<total; i++){
            for(int j=i+1; j<total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            
        }
        return a[total-1];
    }
    public static void main(String[] args) {
        int a[] = {41,25,12,36,84,45};
        int b[] = {75,52,26,15,45,74,87};
        System.out.println("The largest number " + printLargestArray(a, 6));
        System.out.println("The largest number" +printLargestArray(b, 7));
    }
    
}
