package PPT3;

public class PassTest1{
    public void changeStr(String value){
        //引用类型参数
        value=new String("different");//方法中改变形参所指形参所指对象
    }
    public static void main(String args[]){
        String str;
        PassTest1 pt=new PassTest1();

        str=new String("Hello");
        pt.changeStr(str);//引用类型参数的传递
        System.out.println("Str value is:"+str);
    }
}
