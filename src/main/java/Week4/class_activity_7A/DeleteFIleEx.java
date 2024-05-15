package Week4.class_activity_7A;

import java.io.File;

public class DeleteFIleEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        File file = new File(desktopPath + "/myfile.csv");
        if (file.delete()){
            System.out.println("file is deleted");
        }else {
            System.out.println("failed to delete file");
        }
    }
}
