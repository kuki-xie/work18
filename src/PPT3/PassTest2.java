package PPT3;

public class PassTest2 {
    float ptValue;
    public void changeObjValue(PassTest2 ref){
        //引用类型参数
        ref.ptValue=99.0f;//改变参数所指对象的成员变量值
    }
    public static void main(String args[]){
        PassTest2 pt=new PassTest2();

        pt.ptValue=101.0f;
        pt.changeObjValue(pt);//引用类型参数的传递
        System.out.println("Pt value is:"+pt.ptValue);
    }
}
