package homework3.DrawShape;

public class Rectangle extends Shape{
    public Rectangle(String name,int id){
        super(name,id);
    }
    public void draw(){
        System.out.println(id+" "+"Rectangle "+name);
    }
}
