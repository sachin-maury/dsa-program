public class reversestring {
    public static void main(String[] args) {
        String str="Geeks,sachin maurya";
        
        String result = "";
        for(int i= str.length()-1; i>=0; i--)
        result+=str.charAt(i);
        System.out.println(result);
    }
}
