public class bubbleSt {

    public static void printArry(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 8,9,4,1,5,3};
         //    We are shorted array in (n-1):
        for(int i=0; i<arr.length-1; i++){
             for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap method 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
             }
             
            
        }
        printArry(arr);
    }
}
