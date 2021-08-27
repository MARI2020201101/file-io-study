package io;

import java.io.File;

public class TextFileManager {
    public static void main(String[] args) {
        TextFileManager manager = new TextFileManager();
        int numberCount = 10;
        String fullpath = File.separator 
        manager.writeFile(fullpath, numberCount);
    }
}
