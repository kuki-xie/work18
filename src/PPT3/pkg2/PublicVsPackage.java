package PPT3.pkg2;

import PPT3.pkg1.*;

public class PublicVsPackage {
    public static void main(String[] args){
        A obj=new A();
        //B obj2-new B();//在pkg1之外不能创建B的对象
        //obj.func();//在pkg1之外不能访问func()方法
    }
}
