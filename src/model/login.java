package model;
import view.uiAdminMenu;

public class login {
    private String name = "admin";
    private String pass = "admin";
    private static String admin = null;

    public login(String name, String pass) {
        name = name.toLowerCase();
        pass = pass.toLowerCase();
        this.loginAdmin(name, pass);
        uiAdminMenu uiAdmin=new uiAdminMenu();
    }

    public void getlogin() {
        if (name.isEmpty()) {
            login login = new login("admin", "admin");
        }
    }

    public boolean loginAdmin(String name, String pass) {
        getlogin();
        if (this.name == null) {

            if (name!=null) {                return false;            }
        }else if (!this.pass.equals(pass)) {                return false;            }
            if ((this.pass==null)) {
                if (pass == null) {
                    return true;
                }
            } else if (this.pass.equals(pass))   {return true;}

            return false;
        }
    }


