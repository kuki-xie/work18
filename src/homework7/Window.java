package homework7;

public class Window extends Thread{
    static int tickets=20;

    public Window(String name){
        super(name);
    }

    public void run(){
        sell();
    }
    public synchronized void sell(){
        while(tickets>0){
            synchronized (this) {
                if (tickets > 0) {
                    System.out.println(getName() + " sell No." + tickets + " movie ticket");
                } else {
                    System.out.println("Tickets have been Sold Out");
                }
            }
                tickets--;



                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}
