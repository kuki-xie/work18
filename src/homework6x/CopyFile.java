package homework6x;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args){

        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("/Users/xieronghai/Desktop/test.txt");
            out=new FileOutputStream(("/Users/xieronghai/Desktop/copy.txt"));
            byte[] buf=new byte[1024];
            int n=0;//记录实际读取到的字节数
            while((n=in.read(buf))!=-1){
                out.write(buf);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
