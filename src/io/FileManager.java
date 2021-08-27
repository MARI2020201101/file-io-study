package io;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static void main(String[] args) throws IOException {
        FileManager manager = new FileManager();
     //  String pathName = "C:\\study\\file-io-study\\sample.txt";
       // manager.checkFile(pathName);
        String pathName = "..\\";
        manager.getFileInfo(pathName);
    }

    private void checkFile(String pathName) {

        try {
            File file = new File(pathName);
            if(!file.exists()){
                 boolean result = file.createNewFile();
                System.out.println("create new File result: " + result);
            }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    private void getFileInfo(String pathName) throws IOException {
        File file = new File(pathName);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalFile());

        System.out.println(file.getParent());
        System.out.println(file.canRead());
        System.out.println(file.getUsableSpace());
    }
}
