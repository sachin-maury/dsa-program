import java.util.Scanner;

public class arrayProblem {
    public static void main(String[] args){
        System.out.println("Enter your marks : ");
        int marks [] = new int[5];
        Scanner sc = new Scanner(System.in);
      /*   int physics ;
        int chemistry;
        int math;
        int hindi;
        int socialSocial; */

        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();
        marks[4]= sc.nextInt();
        

        System.out.println("physics marks : " + marks[0]);
        System.out.println("chemistry marks : " + marks[1]);
        System.out.println(" math marks : " +  marks[2]);
        System.out.println("hindi marks : " + marks[3]);
        System.out.println("socialSocial marks : " + marks[4]);




    }
}
