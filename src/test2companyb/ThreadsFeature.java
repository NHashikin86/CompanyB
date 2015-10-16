
package test2companyb;

public class ThreadsFeature{
    public static void main (String[] args){
        CountUp up = new CountUp();
        CountDown down= new CountDown();
        up.start();
        down.start();
        try{Thread.sleep(5000);}//**break for 5s
        catch(InterruptedException ex){}
        up.finished=true;
        down.finished=true;
        
           }
}
