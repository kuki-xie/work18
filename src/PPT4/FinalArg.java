package PPT4;
class Gizmo{
  public void spin(){}
}
public class FinalArg {
  void with(final Gizmo g){
    //g=new Gizmo();//错误，g是final的
  }
  void without(Gizmo g){
    g=new Gizmo();
    g.spin();
  }
  int g(final int i){return i+1;}
  public static void main(String[] args){
    FinalArg bf=new FinalArg();
    bf.without(null);
    bf.with(null);
  }
}
