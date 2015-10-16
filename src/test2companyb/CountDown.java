//** Try create for multithreads

package test2companyb;

public class CountDown extends Thread{
    public boolean finished=false;
    public void run();{
    for(int x=10000000;x>0;x--){
        if (finished) break;
        System.out.println("CountDown : "+x);
    }
}
    
}
