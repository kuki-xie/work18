package PPT6;
//ListOfNumbers.java
//创建一个保存10个Integer对象的向量
//并通过writeList方法将该向量保存到OutFile.txt中
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class ListOfNumbers {
  private ArrayList<Integer>list;
  private static final int size=10;
  public ListOfNumbers(){
    list=new ArrayList<Integer>(size);
    for (int i=0;i<size;i++)
      list.add(new Integer(i));
  }
  public void writeList(){
    /*PrintWriter out=new PrintWriter(new FileWriter("OutFile.txt"));
    for(int i=0;i<size;i++)
      out.println("Value at:"+i+"="+list.get(i));
    out.close();*/
    PrintWriter out=null;
    try{
      System.out.println("Entering try statement");
      out=new PrintWriter(new FileWriter("OutFile.txt"));
      for(int i=0;i<size;i++)
        out.println("Value at:"+i+"="+list.get(i));
    }catch (IndexOutOfBoundsException e){
      System.err.println("Caught IndexOutOfBoundsException:"+e.getMessage());
    }catch (IOException e){
      System.err.println("Caught IOException:"+e.getMessage());
    }finally {/*执行程序的最后清理操作，关闭程序打开的文件流*/
      if (out != null) {
        System.out.println("Closing PrintWriter");
        out.close();
      } else {
        System.out.println("PrintWriter not open");
      }
    }
  }
}
