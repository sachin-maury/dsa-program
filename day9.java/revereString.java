public class revereString {
    public static void main(String[] args) {
        int i,l;
        String r = "hello how are you"; 

        String r2 = ""; 

        l = r.length();

        for(i=l-1; i>=0; i--){
            r2 =r2+r.charAt(i);

        }
        System.out.println(r2);
    }
}
