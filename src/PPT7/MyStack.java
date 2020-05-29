package PPT7;

public class MyStack {
    private int idx=0;
    private char[] data=new char[6];
    public void push(char c){
        synchronized (this){
            data[idx]=c;
            idx++;//栈顶指针指向下一个空单元
        }
    }
    public char pop(){
        synchronized (this){
            idx--;
            return data[idx];
        }

    }
}
