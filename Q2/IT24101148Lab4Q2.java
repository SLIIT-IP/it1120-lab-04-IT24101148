import java.util.Scanner;
public class IT24101148Lab4Q2{
       public static void main (String[] args){
                Scanner input= new Scanner(System.in);
                System.out.print("enter exam marks(out of 100): = ");
                int exMarks=input.nextInt();
                if(exMarks>100){
                System.out.println("invalid marks");
                }

                System.out.print("enter lab marks(out of 100): = ");
                int labMarks=input.nextInt();
                if(labMarks>100){System.out.print("invalid marks");
                }

                System.out.print("enter the presentage given for the exam : = ");
                int examP=input.nextInt();
                if(examP<50||examP>50)
                {

                System.out.println("invalid presentage");
                }
                System.out.print("enter the presentage given for the lab marks : = ");
                int examL=input.nextInt();
                if(examL<50||examP>50){
                System.out.println("invalid presentage");
  }


}
}