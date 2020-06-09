package homework3.DrawShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Create c = new Create();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose: 1-create 2-output 3-search 0-exit");
        int choose = sc.nextInt();

        while (choose != 0) {
            if(choose==1)
            {
                System.out.println("Choose（1:Rectangle 2:Circle 3:Triangle)");
                int id =sc.nextInt();
                System.out.println("Give it name");
                String name=sc.next();
                c.create(id,name);
                System.out.println("Create Success");
            }
            if(choose==2)
            {
                System.out.println("Numbers of the shape existing："+c.sum);
                System.out.println("Type the id");
                int id=sc.nextInt();
                if(id>c.sum){
                    System.out.println("Out of bound！");
                }
                else{
                    for(int i=0;i<id;i++){
                        c.s[i].draw();
                    }
                }
            }
            if(choose==3)
            {
                System.out.println("Name to search");
                String name =sc.next();
                for(int i=0;i<c.sum;i++){
                    if(c.s[i].name.equals(name)){
                        System.out.println("Search Success！");
                        c.s[i].draw();
                    }
                }
            }

            System.out.println("Choose: 1-create 2-output 3-search 0-exit");
            try{
                choose=sc.nextInt();
            } catch (Exception e){
                choose=sc.nextInt();
            }
        }
        sc.close();
    }
}
