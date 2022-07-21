
import java.util.Scanner;
public class healthroutine extends Tmanager {
    void hr() {
    int tr;
              Scanner sc = new Scanner(System.in);
              System.out.println("  ");
              System.out.println("--------------------------------------------------------------------------");
              System.out.println("Enter the number of tasks you wish to add");
              System.out.println("--------------------------------------------------------------------------");
              tr = sc.nextInt();
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Enter your health related schedule here:");
                System.out.println("------------------------------------------------------------------------");
                String[] para2 = new String[tr]; 
                int i;
                for(i=0;i<tr;i++)   
                {  
                  para2[i] = sc.next();
                }
              
                System.out.println("------------------------------------------------------------------------"); 
                System.out.println("Enter the respective time you want to give to each task(In Hrs):");
                System.out.println("------------------------------------------------------------------------");
                System.out.println("  ");
                int[] tim = new int[tr]; 
                int i2;
                for(i2=0;i2<tr;i2++)
                {
                  tim[i2] = sc.nextInt();
                }
                System.out.println(" ");
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Do you take any meds?");
                System.out.println("------------------------------------------------------------------------");
                System.out.println(" ");
                char take = sc.next().charAt(0);
                if(take == 'N')
                {
                  datapresent dp = new datapresent();
                  dp.dpresent(para2,tim);

                  System.out.println("    ");
                  System.out.println("Total number of hrs you are supposed to be engaged in your tasks: ");
                  calculate c = new calculate();
                  c.cal(tr, tim);
                }
                if(take == 'Y'){
                  System.out.println("  ");
                  System.out.println("------------------------------------------------------------------------");
                  System.out.println("Enter your meds here and write (Done) when you are finish with the entries: ");
                  System.out.println("------------------------------------------------------------------------");
                  System.out.println(" ");
                  String med = sc.next();
                  while(sc.next() != "Done"){
                    sc.nextLine();
                  }
                  

                }

}
}
