public class calculate extends Tmanager {
    float cal(int a,int[] b){
        float sum = 0;
        for(int i=0;i<a;i++){
            sum = sum + b[i];
        }
        System.out.println(sum);
        return sum;
    }
    void showProgress(int a,int[] b,int c,int[] d){
         System.out.println("The number of tasks you entered before were before were: ");
         System.out.println(a);
         System.out.println(" ");
         System.out.println("The number of tasks you completed are: ");
         System.out.println(c);
         System.out.println("  ");
         int dif = a - c;
         float difper = (c*100)/a;
         System.out.println("  ");
         System.out.println("The total number of hrs you were supposed to be engaged in your tasks was: ");
         calculate cl = new calculate();
         float x = cl.cal(a, b);
         System.out.println( x + "hrs");
         System.out.println("  ");
         System.out.println("The total number of hrs you engaged in your tasks: ");
         float y = cl.cal(c, d);
         System.out.println( y + "hrs");
         float diff = x - y;
         float diffper = ((y*100)/x);

         if((dif == 0) && (diff == 0.0)){
             System.out.println("CONGRATS!!!!!.....You have completed all of your tasks in their respective timings!");
             System.out.println("Your productivity rate is: " + "100%");
         }
         if((dif > 0) && (diff > 0.0)){
            System.out.println("You didn't completed all your tasks in their respective timings:(");
            float prodrate1 = difper;
            float prodrate2 = diffper;
            System.out.println(difper);
            System.out.println(diffper);
        }
        if((dif < 0) && (diff < 0.0)){
            System.out.println("CONGRATS!!!!!.....You have completed all of your tasks in their respective timings!");
            System.out.println("Your productivity rate is: " + "100%");
        }
         
    }
}
