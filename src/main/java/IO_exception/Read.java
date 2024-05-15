package IO_exception;

import java.io.*;

public class Read {
    public static void main(String[] args) throws IOException {

        String[] names  = {"david", "john", "victor"};
        BufferedWriter writer = new BufferedWriter(new FileWriter("testing.txt"));
        writer.write("we don't snitch over here anymore");
        writer.write("\nhere is another line to prove it");
        for (String name :names){
            writer.write("\n" +name);
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("testing.txt"));
        String line;
        while ((line= reader.readLine()) !=null){
            System.out.println(line);
    }
        reader.close();
}
}