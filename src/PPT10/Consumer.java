package PPT10;

public class Consumer extends Thread{
    long x=System.nanoTime();
    @Override
    //run()方法是消费者线程的线程体，每次执行弹栈操作，并将得到的数据输出
    //然后休眠300ms,共进行200次
    public void run() {
        char c;
        for (int i=0;i<200;i++){
            c=theStack.pop();
            System.out.println("Consumer"+num+":"+c+"   "+x);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e){

            }
        }
    }

    private SyncStack theStack;
    private int num;
    private static int counter=1;
    public Consumer(SyncStack s){
        theStack=s;
        num=counter++;
    }
}
