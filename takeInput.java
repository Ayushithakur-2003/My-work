import java.util.Scanner;
import java.util.InputMismatchException;
public class takeInput extends Tmanager {
    public void input(String name){
    Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("  ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Hi," + name + " enter the number of tasks you wish to add");
        System.out.println("--------------------------------------------------------------------------");
          t = sc.nextInt();
         
          System.out.println("------------------------------------------------------------------------");
          System.out.println("Enter your schedule here:");
          System.out.println("------------------------------------------------------------------------");
          String[] para = new String[t]; 
          int i;
          for(i=0;i<t;i++)   
          {  
            try{
              para[i] = sc.next();
              } catch(InputMismatchException e){
                    System.out.println("Invalid input!!!......Plz Try Again");
                    sc.nextLine();    
              }
          }
          System.out.println("------------------------------------------------------------------------"); 
          System.out.println("Enter the respective time you want to give to each task(In Hrs):");
          System.out.println("------------------------------------------------------------------------");
          System.out.println("  ");
          int[] tim = new int[t]; 
          int i2;
          for(i2=0;i2<t;i2++)
          {
            try{
            tim[i2] = sc.nextInt();
            } catch(InputMismatchException e){
                  System.out.println("Invalid input!!!......Plz Try Again");
                  sc.nextLine();    
            }
            
          }
           System.out.println("  ");
           System.out.println("Your Tasks and respective Timings have been recorded.");
           System.out.println("  ");
           System.out.println("------------------------------------------------------------------------");
           System.out.println("Do you wish to add a health routine along with it too?");
           System.out.println("------------------------------------------------------------------------");
           char doyou = sc.next().charAt(0);
           if(doyou == 'Y'){
                healthroutine hrout = new healthroutine();
                  hrout.hr();     
           }
           if(doyou == 'N'){
            datapresent dp = new datapresent();
            dp.dpresent(para,tim);

            System.out.println("    ");
            System.out.println("Total number of hrs you are supposed to be engaged in your tasks: ");
            calculate c = new calculate();
            c.cal(t, tim);
            System.out.println(" ");
           System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("Come back to enter the tasks you have completed from your schedule in their respective timings to get a report.");
           System.out.println("-----------------------------------------------------------------------------------------------------------------");

            System.out.println("  ");
            System.out.println("  ");
            System.out.println("Done with your schedule yet?");
            char ask = sc.next().charAt(0);
            if(ask == 'Y'){
                   
                   System.out.println("Your previously entered tasks were: ");
                   datapresent dpt = new datapresent();
                   dpt.tskpresent(para);
                   System.out.println(" ");
                   System.out.println("Enter the number of tasks you have completed from them: ");
                   int n = sc.nextInt();
                   System.out.println("Enter the repective timings at which you have completed the task(If you haven't completed any task enter '0'): ");
                   int[] timing = new int[n];
                   for(int k=0;k<n;k++){
                     timing[k] = sc.nextInt();
                   }
                   System.out.println("Total number of task you have completed is: ");
                   calculate ct = new calculate();
                   ct.cal(n, timing);
                   System.out.println(" YOUR PROGRESS REPORT: ");
                   System.out.println("  ");
                   ct.showProgress(t, tim, n, timing);
            } 
           
             }
  }
}

