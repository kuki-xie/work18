package PPT4;

import java.util.Random;

class Value{
  int i;
  public Value(int i){this.i=i;}
}
public class FinalData {
  public static Random rand=new Random(47);
  private final int valueOne=9;//基本类型编译时常量
  private final int i4=rand.nextInt(20);//运行时不可变，但非编译时常量
  private Value v1=new Value(22);
  private final Value v2=new Value(22);//引用类型常量
  private final int[]a={1,2,3,4,5,6};//数组类型常量
  public static void main(String[] args){
    FinalData fd1=new FinalData();
    //fd1.valueOne++;
    //fd1.i4++;//valueOne ,i4不能更改
    fd1.v1=new Value(9);//v1不是final的，可引用到新的对象
    //fd1.v2=newValue(0);//v2是final的，不能引用到新的对象
    fd1.v2.i++;//v2引用不能更改，但对象本事可更改
    //fd1.a=new int[3];//数组a为final，不能引用到新的数组
    for(int i=0;i<fd1.a.length;i++){
      fd1.a[i]++;//数组a是final的，但数组元素不是finla的
    }
  }
}
