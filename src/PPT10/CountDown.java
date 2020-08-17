package PPT10;

public class CountDown implements Runnable{
  private static int ident=1;
  private final int threadid=ident++;
  int counter=3;
  public void run(){
    while(counter>=0){
      try{
        Thread.sleep(1000);
      } catch (Exception e){e.printStackTrace();}
      System.out.println("#"+threadid+
          (counter>0?"->"+counter:"->run!"));
      counter--;
    }
  }
  public static void main(String[] args){
    Thread t1=new Thread(new CountDown());//线程是Thread类的一个实例
    Thread t2=new Thread(new CountDown());
    t1.start();
    t2.start();
    System.out.println("waiting for run...");
  }

}
