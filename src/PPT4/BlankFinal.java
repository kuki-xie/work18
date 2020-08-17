package PPT4;

class Poppet {
  private int i;
  Poppet(int ii) {
    i = ii;
  }
}

public class BlankFinal {
  private final int i = 0; // 被初始化的final
  private final int j; // 空白final
  private final Poppet p; // 空白final引用

  public BlankFinal() {
    j = 1; // 初始化空白final
    p = new Poppet(1); // 初始化空白final引用
  }

  public BlankFinal(int x) {
    j = x; // 初始化空白final
    p = new Poppet(x); // 初始化空白final
  }

  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
}
