package daily.tue010725;

import java.io.File;
// import java.io.FileReader;
import java.io.IOException;

public class D1 {
    public static void main(String[] args) throws IOException {
        File infile = new File("//home//hemanth//ubuntuFolder//Hemanth//learnjava//dsa//src//tue010725");
        // File infile = new File("//");
        // FileReader r = new FileReader(infile);
        File[] files = infile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Folder : " + file.getName());
            } else {
                System.out.println("File : " + file.getName());

            }
        }
    }
}
