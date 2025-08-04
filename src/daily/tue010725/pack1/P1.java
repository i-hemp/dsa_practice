package daily.tue010725.pack1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class P1 {
    public static int count = 0;

    public static void printFile(String name, String tab) {
        System.out.println(tab + "↠ File : " + name);
    }

    public static void printFolder(String name, String tab) {
        System.out.println(tab + "↠ Folder : " + name);
    }

    public static void getFolder(File file, String tab) {
        count++;
        File[] insideFile = file.listFiles();
        Arrays.sort(insideFile);
        for (File eachFile : insideFile) {
            if (eachFile.isFile()) {
                // System.out.print("");/
                printFile(eachFile.getName(), "  ".repeat(count));
            } else {
                // count += 1;
                // System.out.print(" ");
                printFolder(eachFile.getName(), "  ".repeat(count));
                getFolder(eachFile, "  ".repeat(count));
                // count--;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File infile = new File("/home/hemanth/ubuntuFolder/Hemanth/learnjava/dsa/src/daily/thu");
        // FileReader r = new FileReader(infile);
        File[] files = infile.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                printFolder(file.getName(), "");
                getFolder(file, "  ");
                count = 0;
            } else {
                printFile(file.getName(), "  ");

            }
        }
    }
}
