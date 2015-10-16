
package test2companyb;

public class ThreadsFeature{
    public static void main (String[] args){
               ThreadsFeature sample=new ThreadsFeature();
               sample.start();
               try{Thread.sleep(500);}
               catch(Exception ex){}
               sample.finished=true;
           }
}
