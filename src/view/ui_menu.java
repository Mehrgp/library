package view;

public class ui_menu {

    public void print(String...arry){
        for (int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
    }

    //String[] defMenu;
    String[] defMenu = new String[]{"1-Admin", "2-user"};

    {
        System.out.println("Chose one");
      //  String[] defMenu=new String[] {"Admin", "user1"};
        print(defMenu);
    }

   public ui_menu() {
        int count=0;
        if(count==1) {

            for (int i = 0; i <= 1; i++) {
                System.out.println(defMenu[i]);
            }
        }
        count++;
    }
    public  void selectionMenu(){
        defMenu= new String[]{"1-manage book","2-manage person","3-manage borowing"};
        print(defMenu);
    }

}
