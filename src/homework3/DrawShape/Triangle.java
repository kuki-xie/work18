package homework3.DrawShape;

public class Triangle extends Shape{
    public Triangle(String name,int id){
        super(name,id);
    }
    public void draw(){
        System.out.println(id+" "+"Triangle "+name);
    }
}
