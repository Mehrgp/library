package model;

import java.util.Scanner;

public class member {
    String name,pass;
    int id;
    int count=0;

    Scanner scanner = new Scanner(System.in);

    private void member () {
        System.out.println("Enter First Name");
        name = scanner.nextLine().toLowerCase();
        System.out.println("\nEnter Last Password");
        pass = scanner.nextLine().toLowerCase();
        System.out.println("\nEnter id ");
        id = scanner.nextInt();
    }
    public void addMember(String... a){
        String[][] arry;
        arry=new String[2][6];
        member();
        arry[count][0]="id:";
        arry[count][2]="name:";
        arry[count][4]="pass:";
            arry[count][1]=String.valueOf(id);
            arry[count][3]=name;
            arry[count][5]=pass;
            for (int i =0;i<6;i++){
                System.out.print(arry[count][i]+"\t");
        }
        System.out.print("\n");
        count++;
    }


}
