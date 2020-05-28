package homework6;

import java.io.*;
import java.util.Scanner;

public class SearchFiles{
    public static void searchFile() {
        Scanner s=new Scanner(System.in);
        System.out.println("Please type the file path:(like:/.../123.txt)");
        String path =s.nextLine();
        System.out.println("please type the key.");
        String key=s.nextLine();

        File file = new File(path);
        File[] files = file.listFiles();
        getFiles(files,key);

    }

    public static int[] getNext(byte[] keywords){
        int[] next =new int[keywords.length];//声明数组next[],长度与数组的长度相同
        int m=0;//m用来控制循环次数，同时用来表示后缀最后一位的下标
        int n=-1;//n用来表示前缀最后一位的下标，n==-1表示令前缀回溯至T[0]
        next[0]=-1;//这里的-1可以看作一个标记，表示准备状态，即T将回溯至T[0]
        while(m<keywords.length-1){//T[n]表示当前前缀最后一位，T[m]表示当前后缀最后一位
            if(n==-1||keywords[m]==keywords[n]){//n==-1（即n在起始位置）或当前前缀和后缀相等，需要比较下一位
                m++;
                n++;
                if(keywords[m]!=keywords[n]){//再次判断自增后是否满足调教
                    next[m]=n;//若不满足，即n不在起始位置，当前前缀和后缀也不相等(也就是最后一位不等）
                }else{
                    next[m]=next[n];
                }
            }else {
                n=next[n];
            }
        }
        return next;
    }
    public static int KMP(byte[] bytes,byte[] keywords,int pos){
        int i=pos-1;//pos表示从第几位开始，一般为0
        int j=-1;//j与getNext()中的n相同，用来表示前缀最后一位的下标，j==-1表示令前缀回溯至T[0]
        int[] next =getNext(keywords);
        while(i<bytes.length && j<keywords.length){
            if(j==-1||bytes[i]==keywords[j]){
                i++;
                j++;
            }else{
                j=next[j];
            }
        }
        if(j==keywords.length){
            return i-keywords.length;
        }else{
            return -1;
        }
    }

    // 递归搜索文件
    public static void getFiles(File[] files,String key) {
        byte[] keywords=key.getBytes();
        try {
            for (File file : files) {
                if (file.isDirectory()) {
                    getFiles(file.listFiles(),key);
                } else {
                    byte[] bytes = new byte[1024];
                    FileInputStream in = new FileInputStream(file);
                    while (in.read(bytes) != -1) {
                        int pos=0;
                        if (KMP(bytes,keywords,pos)!=-1)
                            System.out.println(file.getAbsolutePath());
                    }
                    in.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}