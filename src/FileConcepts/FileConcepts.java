package FileConcepts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileConcepts {
        public static void main (String [] args) throws IOException {
            // current working directory
            System.out.println(System.getProperty("user.dir"));
            // create new file
            File f1 = new File(System.getProperty("user.dir")+"//src/FileConcepts//logs");
            System.out.println(f1.exists());

            System.out.println(f1.canRead());
            System.out.println(f1.canWrite());
            f1.mkdirs();
            System.out.println(f1.exists());
            System.out.println(f1.isDirectory());
            System.out.println(f1.isHidden());
            System.out.println(f1.getPath());
            File f2 = new File(f1.getPath()+ "//Logs.txt");
            System.out.println(f2.exists());
            f2.createNewFile();
            System.out.println(f2.canWrite());
            System.out.println(f2.length());
            System.out.println(f2.lastModified());

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date d1 = new Date(f2.lastModified());
            System.out.println(sdf.format(d1));

            File f3 = new File( f1.getPath() + "//Logs1.txt");
            if (f3.exists())
                f3.delete();
            f2.renameTo(f3);
            f3.deleteOnExit();
            System.out.println(f3.length());
        }
}
