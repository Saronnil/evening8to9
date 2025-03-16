package FileConcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

    public static void main(String[] args) throws IOException {
        WriteDataToFile(System.getProperty("user.dir") + "//src/FileConcepts/logs//logs2.txt", "My Name is Sukhbir");
        WriteDataToFile(System.getProperty("user.dir") + "//src/FileConcepts/logs//logs2.txt", "My Name is ronnil");

        WriteDataToFile(System.getProperty("user.dir") + "//src/FileConcepts/logs//logs2.txt", "My Name is Sara");

    }

    public static void WriteDataToFile(String filepath, String content) throws IOException {
        File f1 = new File(filepath);
        if (f1.exists()) {
            FileWriter f2 = new FileWriter(filepath, true);
            f2.write(content);
            f2.write("\n");
            f2.close();

        } else {

            FileWriter f2 = new FileWriter(filepath);
            f2.write(content);
            f2.close();

        }
    }
}
