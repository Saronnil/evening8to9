package FileConcepts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class FileReading {
    public static void main (String [] args) throws IOException {
    FileReadingfunction(System.getProperty("user.dir")+"//src//FileConcepts//logs//logs2.txt");
    FileReadingAlternate(System.getProperty("user.dir")+"//src//FileConcepts//logs//logs2.txt");
    }

    public static void FileReadingfunction(String filepath) throws IOException {
        FileReader f1 = new FileReader(filepath);
        System.out.println(f1.read());

        int a = 0;
        while ((a= f1.read())!= -1){
            System.out.print((char) a);
        }
    }

    public static void FileReadingAlternate(String filepath) throws IOException {
        FileReader  f1 = new FileReader(filepath);
        BufferedReader br = new BufferedReader(f1);
        System.out.println(br.readLine());
        System.out.println(br.lines().collect(Collectors.joining("\n")));
    }

}
