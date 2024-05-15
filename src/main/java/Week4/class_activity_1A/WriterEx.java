package Week4.class_activity_1A;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Writer wr = new FileWriter(desktopPath + "/output.csv");
            String fileContent = "i am learning to write to a csv file";
            wr.write(fileContent);
            wr.close();
            System.out.println("Successfully write into a csv file");
        } catch (IOException var4) {
            IOException e = var4;
            throw new RuntimeException(e);
        }
    }
}
