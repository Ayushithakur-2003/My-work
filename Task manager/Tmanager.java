
import java.util.Scanner;
public class Tmanager{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          String name;
          char a,b;
          System.out.println("  ");
          System.out.println("------------------------------------------------------------------------");
          System.out.println("Enter your Name: ");
          System.out.println("------------------------------------------------------------------------");
          name = sc.next();
          System.out.println("  ");
          System.out.println("------------------------------------------------------------------------");
          System.out.println("Your Age: ");
          System.out.println("------------------------------------------------------------------------");
          System.out.println("A.13-30");
          System.out.println("B.30-50");
          System.out.println("C.More than 50"); 
          System.out.println("------------------------------------------------------------------------");
          System.out.println("  ");
          a = sc.next().charAt(0);
          System.out.println("  ");
          System.out.println("------------------------------------------------------------------------");
          System.out.println("Your Occupation type:");
          System.out.println("------------------------------------------------------------------------");
          System.out.println("A.Student");
          System.out.println("B.Part timer");
          System.out.println("C.Full timer");
          System.out.println("------------------------------------------------------------------------"); 
          System.out.println("  ");
          b = sc.next().charAt(0);

        if(b == 'A'){
          takeInput ti = new takeInput();
          ti.input(name);
        }

        if(b == 'B'){
          System.out.println("What do you do along with your part-time job?");
          String enter = sc.next();
          System.out.println("OK!, So you do " +enter+" along with being a part-timer");
          System.out.println(" ");
          takeInput ti = new takeInput();
          ti.input(name);
        }
        if(b == 'C'){
          takeInput ti = new takeInput();
          ti.input(name);
        }

        }
      
}

    
}