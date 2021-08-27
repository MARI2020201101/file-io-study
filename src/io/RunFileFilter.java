package io;

import java.io.File;

public class RunFileFilter {
    public static void main(String[] args) {
        RunFileFilter filter = new RunFileFilter();
        String pathName = "C:\\Users\\dbrtm\\OneDrive\\사진\\사진";
        filter.runFileFilter(pathName);

    }

    private void runFileFilter(String pathName) {
        File file = new File(pathName);
       // File[] mainFileList = file.listFiles();
        File[] mainFileList = file.listFiles(new JPGFileFilter());
        for (File file1 : mainFileList) {
            System.out.println(file1.getName());
        }
    }
}
