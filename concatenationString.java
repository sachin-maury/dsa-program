public class concatenationString {
    public static void main(String[] args) {
        String firstName = "Sachin";
        String lastName = "Singh";
        String fullName = firstName + lastName;
        System.out.println(fullName.length());
        // CharAt
        for( int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        } 
    }
}
