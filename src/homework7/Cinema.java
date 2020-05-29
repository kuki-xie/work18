package homework7;

public class Cinema {
    public static void main(String[] args){
        Window w=new Window("Total");
        Thread win1=new Thread(w,"Window 1");
        Thread win2=new Thread(w,"Window 2");
        Thread win3=new Thread(w,"Window 3");

        win1.start();
        win2.start();
        win3.start();
    }
}
