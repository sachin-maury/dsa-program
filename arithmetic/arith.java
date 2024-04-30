import arithmetic.arithclass;
public class arith{
    public static void main(String[] args) {
        arithclass a = new arithclass();
        int c = a.add(10, 5);
        System.out.println("add :" +c);
        int d = a.sub(8, 3);
        System.out.println("sub :" +d);
        int b = a.mul(8,3);
        System.out.println("mul :" +b);
    }
}