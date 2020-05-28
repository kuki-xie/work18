package homework6;

import java.io.*;
import java.util.Scanner;

public class MainCopy {
    public static void exit(int status) {
        Runtime.getRuntime().exit(status);
    }
    /**
     * Main
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        /* Create Menu */
        while (true) {
            System.out.println("==========Please type the choice==================");
            System.out.println("==========choice 1:Count paragraphs and words");
            System.out.println("==========choice 2:Count the times of A-Z");
            System.out.println("==========choice 3:Give string and search files");
            System.out.println("==========choice 4:Copy files ");
            System.out.println("==========choice 0:exit");
            System.out.println("Please input the choice");

            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            //giving choice
            switch (choice) {
                case 1:
                    Countline.countwp();
                    break;
                case 2:
                    CountAbc.countA();
                    break;
                case 3:
                    SearchFiles.searchFile();
                    break;
                case 0:exit(0);
                    break;
                default:
                    break;
            }

            if (choice != 4) {
                continue;
            }
            if (args.length != 2) {//如果参数长度不为2，说明为传递实参
                System.out.println("please input the filename");
            } else {
                File f1 = new File(args[0]);
                FileInputStream in = new FileInputStream(f1);
                //使用字节流
                File f2 = new File(args[1]);
                boolean bool = f2.createNewFile();//如果指定的文件不存在并成功创建,则返回true,如果指定的文件已经存在就返回false
                if (!bool) {//判断目文件是否存在
                    System.out.println("ERROR!!!The aim file exists");
                } else {
                    if (!f1.exists()) {//判断源文件是否存在
                        System.out.println("ERROR!!!The file you want to copy from doesn't exist");

                    } else if (f1.getName().equals(f2.getName())) {//判断文件名是否相等
                        System.out.println("ERROR!!!The two files' name repeat");
                    } else {
                        FileOutputStream out = new FileOutputStream(f2);//创建字节流
                        try {
                            int c;
                            while ((c = in.read()) != -1) {//单字节读
                                out.write(c);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        } finally {
                            try {
                                in.close();
                            } catch (IOException e) {
                                System.out.println("文件读取关闭失败");
                            }
                            try {
                                out.close();
                                System.out.println("Copy success");
                                System.out.println();
                            } catch (IOException e) {
                                System.out.println("文件写入关闭失败");
                            }

                        }
                    }
                }
            }
        }
    }
}
