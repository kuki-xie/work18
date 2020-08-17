package PPT10;

public class CountDown3 {
    static int idcnt = 1;

    public static void main(String[] args) {
        new SubThread().start();
        new Thread(new Run()).start();
    }
}
    class SubThread extends Thread {
        private final int threadid = CountDown3.idcnt++;
        long t=System.currentTimeMillis();
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("#" + threadid+"   "+t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class Parent{
        long t=System.currentTimeMillis();
        public void doSth(){
            System.out.println("do something...   "+t);
        }
    }

    class Run extends Parent implements Runnable{
        private final int threadid=CountDown3.idcnt++;
        long t=System.currentTimeMillis();
        public void run(){
            try {
                Thread.sleep(1000);
                System.out.println("#"+threadid+":   "+t);
                doSth();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }