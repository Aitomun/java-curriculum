package Week4.class_activity_4A;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileWriter fw = new FileWriter(desktopPath + "/output3.csv");
            fw.write("we are not there yet");
            fw.close();
        } catch (IOException var3) {
            IOException e = var3;
            throw new RuntimeException(e);
        }

        System.out.println("successfully written into a csv file");
    }
}
