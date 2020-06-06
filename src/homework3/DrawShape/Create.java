package homework3.DrawShape;

public class Create {
    public Shape[] s=new Shape[20];
    int sum=0;
    public void create(int i,String name){
        switch (i){
            case 1:s[sum]=new Rectangle(name,sum+1);
                   sum++;
                   return;
            case 2:s[sum]=new Circle(name,sum+1);
                   sum++;
                   return;
            case 3:s[sum]=new Triangle(name,sum+1);
                   sum++;
                   return;
            default:System.out.printf("请输入正确的指令！");
        }
    }
}
