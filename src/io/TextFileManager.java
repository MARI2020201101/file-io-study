package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TextFileManager {
    public static void main(String[] args) {
        TextFileManager manager = new TextFileManager();
        int numberCount = 10;
        String fullpath = "C:\\study\\file-io-study\\sample2.txt";
        manager.writeFile(fullpath, numberCount);
    }

    private void writeFile(String fullpath, int numberCount) {
        try (FileWriter writer = new FileWriter(fullpath , StandardCharsets.UTF_8, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for(int i = 0; i<numberCount ; i++){
                bufferedWriter.write(String.valueOf(i));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
