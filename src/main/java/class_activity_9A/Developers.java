package class_activity_9A;

public class Developers {
    int id;

    public Developers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String name;
   static String institute = "Decagon";

    void display(){
        System.out.println( id + " " + name +" " +institute);
    }


}
