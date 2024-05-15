package class_activity_11A;

public class Splitx {
    public static void main(String[] args) {
        String s1 = "This is a java split";
        System.out.println("before splitting: " + s1);

        String[] word = s1.split("//s");
        for (String w:word){
            System.out.println(w);

        }

    }
}
