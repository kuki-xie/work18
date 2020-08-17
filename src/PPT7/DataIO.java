package PPT7;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIO {
  public static void main(String[] args) throws IOException{
    DataOutputStream out=new DataOutputStream(
        new BufferedOutputStream(new FileOutputStream("data.txt")));
    out.writeBoolean(false);out.writeChar('c');
    out.writeByte(1);out.writeShort(2);
    out.writeInt(3);out.writeLong(4L);
    out.writeFloat(5.0f);out.writeDouble(6.0);
    out.writeUTF("hello world!");out.close();
  }
}
