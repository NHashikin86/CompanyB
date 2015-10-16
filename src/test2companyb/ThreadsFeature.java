
package test2companyb;

public class ThreadsFeature extends Thread{
    public boolean finished=false;
  
    public void run(){
        for(int x=1;x<6666;x++){
            if(finished) break;
            System.out.println(x);
        }
    }
           public static void main (String[] args){
               ThreadsFeature sample=new ThreadsFeature();
               sample.start();
               try{Thread.sleep(500);}
               catch(Exception ex){}
               sample.finished=true;
           }
}
