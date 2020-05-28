package PPT7;

class ToJoin extends Thread{
    long t2=System.currentTimeMillis();
    public ToJoin(String nm){
        super(nm);
    }
    public void run(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){

        }
        System.out.println(Thread.currentThread().getName()+" awake!   "+t2);
    }
}
class Joiner implements Runnable{
    private ToJoin tojoin;
    public Joiner(ToJoin t){
        this.tojoin=t;
    }
    public void run(){
        long t2=System.currentTimeMillis();
        try{
            this.tojoin.join();
        } catch (InterruptedException e){

        }
        System.out.println(this.tojoin.getName()+" join finished!   "+t2);
    }
}
public class TestJoin {
    public static void main(String[] args){
        ToJoin t1=new ToJoin("t1");
        t1.start();
        new Thread(new Joiner(t1)).start();
    }
}
