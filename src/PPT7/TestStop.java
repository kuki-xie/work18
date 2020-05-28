package PPT7;

public class TestStop {
    public static void main(String[] args){
        long x=System.currentTimeMillis();
        Tick t=new Tick();
        new Thread(t).start();
        try{
            Thread.sleep(3000);
        } catch (Exception e){

        }
        System.out.println("quiting Task...   "+x);
        t.stopRunning();
    }
}
class Tick implements Runnable{
    static long zeroTime;
    long x=System.currentTimeMillis();
    private boolean timeToQuit=false;
    public void stopRunning(){
        timeToQuit=true;
    }
    public void run(){
        while (!timeToQuit){
            try {
                Thread.sleep(1000);
                System.out.println("tick...   "+x);
            } catch (Exception e){

            }
        }
        System.out.println("Tick finished.   "+x);
    }

}
