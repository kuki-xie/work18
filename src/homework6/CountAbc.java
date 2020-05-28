package homework6;

import java.io.*;
import java.util.Scanner;

public class CountAbc {
    public static void countA(){
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("Please type the file path:(like:/.../123.txt)");
            String a=s.nextLine();
            InputStreamReader read=new InputStreamReader(new FileInputStream(a));
            BufferedReader in=new BufferedReader(read);
            String str=null;
            int[]num=new int[26];
            char abc='A';
            while((str=in.readLine())!=null){
                String Str=str.toUpperCase();
                for(int i=0;i<Str.length();i++){
                    if(Character.isLetter(Str.charAt(i))) {
                        num[Str.charAt(i) - 'A']++;
                    }
                }
            }
            in.close();
            int i;
            for(i=0;i<num.length;i++) {
                System.out.println("The number of "+abc+" is "+ num[i]);
                abc++;
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
