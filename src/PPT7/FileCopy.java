package PPT7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
  public static void main(String[] args)throws IOException{
    FileInputStream in =new FileInputStream("PPT7/FileCopy.java");
    FileOutputStream out=new FileOutputStream("FileCopy.txt");
    int c;
    while((c=in.read())!=-1)
      out.write(c);
    in.close();
    out.close();
  }
}
