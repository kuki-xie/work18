package homework6;

import java.io.*;
import java.util.Scanner;

public class Countline {
   public static void countwp() throws IOException {
       Scanner s=new Scanner(System.in);
       System.out.println("Please type the file path:(like:/.../123.txt)");
       String a=s.nextLine();
       File file=new File(a);
       FileInputStream fileStream=new FileInputStream((file));
       InputStreamReader input=new InputStreamReader(fileStream);
       BufferedReader reader=new BufferedReader(input);

       String line;
       //Initializing counters
       int countWord=0;
       int paragraphCount=0;

       //Reading line by line frome the
       //file util a null is returned
       while((line= reader.readLine())!=null){
           paragraphCount++;
           if(!(line.equals(""))){
               //\s+ is the space delimiter in java
               String[] wordList=line.split("\\s");
               countWord += wordList.length;
           }
       }
       System.out.println("Total word count ="+ countWord);
       System.out.println("Number of paragraphs="+paragraphCount);
       System.out.println();
   }
}
