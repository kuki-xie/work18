package PPT10;

import java.util.Vector;

public class SyncStack {
    private Vector<Character> buffer=new Vector<Character>(400,200);
    //为了保证共享数据一致性，push()方法和pop()方法定义为synchronized
    public synchronized char pop(){
        char c;
        //如果堆栈为空，则执行该方法的线程必须等待，直到堆栈中有数据
        while(buffer.size()==0){
            try {
                this.wait();
            } catch (InterruptedException e){
            }
        }
        c=((Character)buffer.remove(buffer.size()-1)).charValue();//进行弹栈操作
        return c;
    }
    public synchronized void push(char c){
        this.notify();//通知等待的线程
        Character charObj=new Character(c) ;
        buffer.addElement(charObj);
    }
}
