package PPT7;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedIO {
  public static void main(String[] args) throws IOException{
    BufferedReader in=new BufferedReader(
        new FileReader("PPT7/BufferedIO.java"));
    PrintWriter out=new PrintWriter(new BufferedWriter(
        new FileWriter("BufferedIO.txt")));
    String s;
    int linecnt=1;
    StringBuilder sb=new StringBuilder();
    while((s=in.readLine())!=null){
      sb.append(linecnt+":"+s+"\n");
      out.println(linecnt+":"+s);
      linecnt++;
    }
    in.close();
    out.close();
    System.out.println(sb.toString());

  }
}
