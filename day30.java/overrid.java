class A {
    public void show(){
    System.out.println("welcome To my India");
}
}
class B extends A {
    public void dev(){
        System.out.println("India is a beautyful country :");
    }

}

public class overrid {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.dev();
       
    }
}
