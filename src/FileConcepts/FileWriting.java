package FileConcepts;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main (String [] args) throws IOException {
      WriteDataToFile(System.getProperty("user.dir")+"//src/FileConcepts/logs//logs2.txt" ,"My Name is Sukhbir");
        WriteDataToFile(System.getProperty("user.dir")+"//src/FileConcepts/logs//logs2.txt" ,"My Name is ronnil");

        WriteDataToFile(System.getProperty("user.dir")+"//src/FileConcepts/logs//logs2.txt" ,"My Name is Sara");

    }

    public static void WriteDataToFile(String filepath , String content) throws IOException {
        FileWriter f1 = new FileWriter (filepath);
        f1.write(content);
        f1.close();

    }
}
