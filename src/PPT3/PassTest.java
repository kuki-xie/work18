package PPT3;

public class PassTest {
    public void changeInt(int value){
        //基本类型的参数
        value=55;
    }
    public static void main(String[] args){
        int val;
        PassTest pt=new PassTest();

        val=11;
        pt.changeInt(val);//基本类型参数的值传递
        System.out.println("Int value is:"+val);
    }
}
