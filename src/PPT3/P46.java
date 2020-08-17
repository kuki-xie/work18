package PPT3;

public class P46 {
  public static void main(String args[]){
    int a=1;
    double d=1.0;
    System.out.println("a="+46/9);
    System.out.println("a="+(46%9+4*4-2));
    System.out.println("a="+(45+43%5*(23*3%2)));
    System.out.println("d="+(4+d*d+4));
    System.out.println(d+=1.5*3+(++a));
    d=1.0;
    a=1;
    System.out.println((d-=1.5*3+a++));
  }
}
