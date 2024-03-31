public class looping {
    public static void main(String[] args) {
        for(int i=0; i<11; i++){
            System.out.println(i);
        }
        System.out.println("Using while loop:");
        int p=0;
        while(p<11){
            System.out.println(p);
            p++;
        }
        System.out.println("Here using do while loop:");
        int o=0;
        do{
            System.out.println(o);
            o++;
        }
        while(o<=11);
    }
}
