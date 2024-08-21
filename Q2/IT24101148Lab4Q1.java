import java.util.Scanner;
public class IT24101148Lab4Q1{
        public static void main (String[] args){
               Scanner input= new Scanner(System.in);
               System.out.print("enter number = ");
               int number=input.nextInt();
               if(number<0){

               System.out.print("number is negative");
               }
               else if(number>0){

               System.out.println("number is positive");
               }
               else if(number==0){
               System.out.println("number is zero");
               }


}
}
