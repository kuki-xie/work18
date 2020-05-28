package PPT7;

public class CountDown implements Runnable{
    private static int idcnt=1;
    private final int threadid=idcnt++;
    int counter=3;
    public void run(){
        while (counter>=0){
            try{
                Thread.sleep(1000);
            } catch (Exception e){
                e.printStackTrace();
            }
            long t=System.currentTimeMillis();
            System.out.println("#"+threadid+(counter>0?("->"+counter+"   "+t):("->run!"+"   "+t)));
            counter--;
        }
    }
    public static void main(String[] args){
        Thread t1=new Thread(new CountDown());
        Thread t2=new Thread(new CountDown());
        t1.start();
        t2.start();
        long t=System.currentTimeMillis();
        System.out.println("waiting for run...   "+t);
    }
}
