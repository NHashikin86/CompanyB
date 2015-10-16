//** Try create for multithreads

package test2companyb;

public class CountUp extends Thread{
   
    public boolean finished=false;
   
        public void run(){
    for(int x=1;x<10000000;x++){
        if (finished) break;
        System.out.println("CountUp : " + x);
    }
}
    
}
