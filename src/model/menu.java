package model;

import view.ui_menu;
import model.book;

import java.util.Scanner;

public class menu {


    static {
        ui_menu uiM = new ui_menu();
   }
    Scanner scan = new Scanner(System.in);
    public void reginMenu() {
        int selection = scan.nextInt();
      //  menu mm = new menu(selection);
        switch (selection) {
            case 1:
                authorization();
                break;
            case 2:

                //// اینجا برای user اضافه بشه
                ui_menu uuuu=new ui_menu();
                uuuu.selectionMenu();
                int select =scan.nextInt();
                if(select==1) {
                    book b= new book();
                  //  b.bookValue();
                    System.out.println(b.toString());
                }
                break;
                default:
                    System.out.println("Please try again:");
                    this.authorization();

        }

    }
    public menu() {

        /*switch (inputMenue) {
            case 1:
                authorization();
            default:*/
               // ui_menu uiM = new ui_menu();
                this.reginMenu();
    }

    public void authorization() {
        System.out.println("Enter user name:");
        String strName ="admin" ;//scan.nextLine();
        System.out.println("Enter Password:");
        String strPass ="admin";// scan.nextLine();
        login logn = new login(strName, strPass);
        reginMenu();
        //logn.getlogin(strName,strPass);
    }
   /* public  int selectMenu(){
        //ui_menu uiMenu;
        ui_menu uuuu=new ui_menu();
        uuuu.selectionMenu();
        int select =scan.nextInt();
        switch (select) {
            case 1:

        }
        return 1;
    }*/
}

