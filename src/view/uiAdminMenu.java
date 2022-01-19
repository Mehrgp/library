package view;

import model.book;

import java.util.Scanner;

public class uiAdminMenu {
    ui_menu uiMenu=new ui_menu();
    book bok= new book();

    Scanner scan =new Scanner(System.in);
    int select =scan.nextInt();
    public  uiAdminMenu  ()  {
        switch (select){
            case 1:
                book b= new book();
                break;
            case 2:
                bok.editBook();
                break;
            case 3:
                bok.print();
                break;



        }
    }
}

