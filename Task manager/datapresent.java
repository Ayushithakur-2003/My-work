public class datapresent extends Tmanager{
    void dpresent(String[] a,int[] b){
        System.out.println("YOUR SCHEDULE FOR TODAY: "); 
        System.out.println("=======================================================================");
        System.out.println("  ");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("  ");     
        System.out.printf("%5s\n", "TASKS: ");
        for(String s:a){
         System.out.format("%5s\n",s);
        }
        System.out.println(" ");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("  ");
        System.out.printf("%5s\n", "TIME(In hrs): ");
        for(int tm:b){
          System.out.format("%3d\n",tm);
        }
          System.out.println("  ");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("  ");
        System.out.println("=======================================================================");

        
    }
    void tskpresent(String[] c){
      System.out.println("YOUR SCHEDULE FOR TODAY: "); 
        System.out.println("=======================================================================");
        System.out.println("  ");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("  ");     
        System.out.printf("%5s\n", "TASKS: ");
        for(String s:c){
         System.out.format("%5s\n",s);
        }
    }
  }


    
