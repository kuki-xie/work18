package homework4x;

import java.util.HashMap;
import java.util.Map;

public class Student {
  private final String stuId;
  private Map<Integer,String>borrowingBooks=new HashMap<>();
  Student(String stuId){
    this.stuId=stuId;
  }
  public String getStuId(){
    return stuId;
  }
}
