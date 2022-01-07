package model;


public enum Genre {
    dram    , romantic, scienceFiction, scary;

    private Genre() {
    }


    public static String[] AsStringArray() {
        Genre[] genres = values();
        String[] name = new String[genres.length];
        for (int i = 0; i < genres.length; i++) {
            name[i] = genres[i].name();
        }
        return name;
    }
/*public int getnumber(){
        return number;
}*/

}


