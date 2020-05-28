package homework6x;

import java.io.File;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CountWords {
    public static void main(String[] args) throws Exception {
        new CountWords().wordCount();
    }//统计文本中单词出现的个数

    public void wordCount() throws Exception{
        File file=new File("/Users/xieronghai/Desktop/test");//访问文件地址
        Scanner sc=new Scanner(file);//读入文件
        HashMap<String,Integer> hashMap=new HashMap<>();//实例化Map
        System.out.println("文章打印如下");
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.print(line+" ");
            String[] lineWords=line.split("\\W+");

            Set<String> wordSet=hashMap.keySet();
            for(int i=0;i<lineWords.length;i++){
                if(wordSet.contains(lineWords[i])){
                    Integer number=hashMap.get(lineWords[i]);
                    number++;
                    hashMap.put(lineWords[i],number);
                }else{
                    hashMap.put(lineWords[i],1);
                }
            }
        }
        System.out.println("统计单词------------------");
        Iterator<String> iterator=hashMap.keySet().iterator();
        while(iterator.hasNext()){
            String word=iterator.next();
            System.out.printf("单词:%-12s   出现次数：%d\n",word,hashMap.get(word));
        }
    }
}