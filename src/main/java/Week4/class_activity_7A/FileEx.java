package Week4.class_activity_7A;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

    try {
        File file = new File(desktopPath + "/myfile.csv");
        if (file.createNewFile()) {
            System.out.println("new file created");
        }else {
            System.out.println("file already exist");
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }

}
