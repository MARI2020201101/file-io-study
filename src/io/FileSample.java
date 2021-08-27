package io;

import java.io.File;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "C:\\study\\file-io-study\\sample.txt";
     //   sample.checkpath(pathName);
        sample.makeDir(pathName);
    }

    private void checkpath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is Exist> : "+ file.exists());
    }

    private void makeDir(String pathName){
        File file = new File(pathName);
        if(!file.exists()){
            boolean mkdir =file.mkdir();
            System.out.println(pathName +" mkdir result: "+ mkdir);
        }

    }
}
