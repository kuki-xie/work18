package PPT6;

public class AssertionDemo {
  public static void main(String[] args){
    int month=13;
    switch (month){
      case 1:System.out.println("January");break;
      case 2:System.out.println("February");break;
      case 3:System.out.println("March");break;
      case 4:System.out.println("April");break;
      case 5:System.out.println("May");break;
      case 6:System.out.println("June");break;
      case 7:System.out.println("July");break;
      case 8:System.out.println("Augest");break;
      case 9:System.out.println("September");break;
      case 10:System.out.println("October");break;
      case 11:System.out.println("December");break;
      default:assert false:"Hey,that's not a valid month";break;
    }
  }
}
