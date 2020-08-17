package PPT4;

public class TestStaticMethod {
  public static void main(String[] args){
    StaticMethod obj=new StaticMethod();
    StaticMethod.sPrintXAndY(obj);
  }
}
class StaticMethod{
  int x=0;
  static int y=1;
  public void iPrintAndIncreaseY(){
    sPrintY();
    y++;
  }
  public static void sPrintY(){
    //System.out.print(this.x);//不能访问实例成员变量
    //iPrintAndIncreaseY();//不能访问实例方法
    System.out.println(StaticMethod.y);//可以访问静态变量
  }
  public static void sPrintXAndY(StaticMethod o){
    System.out.println(o.x);//可以通过o引用访问实例成员变量
    o.iPrintAndIncreaseY();//可以通过o引用调用实例方法
    sPrintY();//可以直接调用静态方法
  }
}
