public class setBit {

    public static void main(String[] args) {

        int n = 5;

        int pos =1;

        int bitMass =1<<pos;

        int newNumber = bitMass | n ;

        System.out.println(newNumber);

        if((bitMass | n ) == 0){

            System.out.println("Bit was zero :");
        }
        
        else{
            System.out.println("Bit was one");
        }
    }
}