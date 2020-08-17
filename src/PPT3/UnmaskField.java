package PPT3;

public class UnmaskField {
  private int x=1;
  private int y=1;
  public void changeFields(int a,int b){
    x=a;//x指成员变量
    int y=b;//局部变量y使同名的类成员变量被隐藏
    this.y=8;//this.y指成员变量
    System.out.println("x="+x+";y="+y);//局部变量y的值
  }
  public void PrintFields(){System.out.println("x="+x+";y="+y);}
  public static void main(String args[]){
    UnmaskField uf=new UnmaskField();
    uf.PrintFields();
    uf.changeFields(10,9);
    uf.PrintFields();
  }
}
