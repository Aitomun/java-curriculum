package Week4.class_activity_2A;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {
        String desktop = System.getProperty("user.home") + "/Desktop";

        try {
            Reader r = new FileReader(desktop + "/output.csv");

            for (int readContent = r.read(); readContent != -1; readContent = r.read()) {
                System.out.println((char) readContent);
            }
            r.close();
        } catch (IOException var4) {
            IOException e = var4;
            throw new RuntimeException(e);
        }
    }
}