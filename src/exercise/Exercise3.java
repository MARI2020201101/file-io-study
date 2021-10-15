package exercise;

import java.io.File;

public class Exercise3 {
    static int totalFiles = 0;
    static int totalDirs = 0;
    static int totalSize = 0;
    public static void main(String[] args) {
        if(args.length!=1){
            System.exit(0);
        }
        File dir = new File(args[0]);
        if(!dir.isFile() && !dir.isDirectory()){
            System.exit(0);
        }
        answer(dir);
        System.out.println(totalFiles);
        System.out.println(totalDirs);
        System.out.println(totalSize);


    }

    static void countFiles(File dir){
        if(dir.isDirectory()){
            totalDirs++;
            countFiles(dir);
        }
        else{
            totalFiles++;
            totalSize+=dir.getTotalSpace();
        }
    }
    static void answer(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                totalDirs++;
                answer(file);
            }else{
                totalFiles++;
                totalSize+=dir.length();
            }

        }
    }
}
