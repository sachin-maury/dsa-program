public class halfPyramid {
    public static void main(String[] args) {
        int n=4;
        int m=0;
// outere loop
        for(int i=1; i<=n; i++){
            for(int j=1-i; j<=m; j++){
                System.out.print("*");
            }
               System.out.println();
        }
    }
}
