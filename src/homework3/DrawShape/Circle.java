package homework3.DrawShape;

public class Circle extends Shape{
    public Circle(String name,int id){
        super(name,id);
    }
    public void draw(){
        System.out.println(id+" "+"Circle "+name);
    }
}
