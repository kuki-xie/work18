package PPT7;

public class Producer implements Runnable{
    static long x=System.nanoTime();
    //run()方法是生产者线程的线程体，每次随机产生一个字母放入堆栈
    //然后休眠300ms,共进行200次
    public void run(){
        char c;
        for (int i=0;i<200;i++){
            c=(char)(Math.random()*26+'A');
            theStack.push(c);
            System.out.println("Producer"+num+":"+c+"   "+x);
            try{
                Thread.sleep(300);
            } catch (InterruptedException e){

            }
        }
    }

    private SyncStack theStack;
    private int num;
    private static int counter=1;
    public Producer(SyncStack s){
        theStack=s;
        num=counter++;
    }
}
