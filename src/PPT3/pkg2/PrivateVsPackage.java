package PPT3.pkg2;

public class PrivateVsPackage {
    public static void main(String[] args){
        C obj=new C();//默认构造方法的权限与类的访问权限相同
        obj.func2();
        //obj.func1();//与C在同一包中的其他类无法访问func1()
    }
}
class C{
    private void func1(){
        System.out.println("C's method 1");
    }
    void func2(){
        System.out.println("C's method 2");
        this.func1();//在同一个类内可以调用func1()
    }
}
