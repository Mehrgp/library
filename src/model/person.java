package model;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class person {
    private String firstName,lastName;
    String pass;
    private int id;
    private static int maxAge=100;
    private int age;
    private static int idPerson=1;
    public person(/*@NotNull String firstName, String lastName, @NotNull String pass*/){
        /*firstName=firstName.toLowerCase();
        lastName=lastName.toLowerCase();
        id=idPerson++;
        pass=pass.toLowerCase();*/
        createPerson();
    }
    public void  createPerson(){
        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter FirstName: ");
        String pFirstName=scan.nextLine();
        System.out.print("\n Enter LastName: ");
        String pLastName=scan.nextLine();
        System.out.print("\n Enter Password:");
        String pPass=scan.nextLine();
        toString();
        //return  person(pFirstName,pLastName,pPass);
    }
    public String toString(){return "newPerson >> {first name:"+firstName+",last name :"+lastName+",id:"+id ;   }
    public void callPerson(){
        createPerson();
    }
//public person(){}


}
