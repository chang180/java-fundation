package homework.unit56;

import java.io.File;
import java.io.IOException;

public class DOS {
    public static void main(String[] args) {
        File dir = new File("dir");
        dir.mkdir();
        File fl = new File(dir, "fl.txt");
        try {
            fl.createNewFile();
        } catch (IOException e) {
            ;
        }
        File newDir = new File("newDir");
        dir.renameTo(newDir); // The file system has a directory named newDir, containing a file fl.txt.
    }
}
