package JavaSimpleProjects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {//parameter
        //return type describes output
        // write your code here
       /* System.out.println("Enter your name!");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s);
        if (s.equals("Aygul")) {
            System.out.println("Hey, Aygul!");
        } else if (s.equals("Ramile")) {
            System.out.println("hey,Ramile!");
        } else System.out.println("You are welcome here!");
        in.close();*/
        int i=0;
        while (i<20){//initialization
            System.out.println(i);//condition
            i++;//update
        }
        for(int a=0;a<20;a++){
            System.out.print(a);
        }
        int e=78;
        do {
            System.out.println(" e is "+e+"; ");
            e++;
        }while (e<=100);

    }
}
/* class -instantiation->object */